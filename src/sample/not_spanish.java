package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class not_spanish {
    private boolean not_spanish;
    private int validWords;
    private int docLength;
    private double validityFactor;
    private ArrayList<String> words;
    private BigArrayStoreSpanish biggy;
    private double cutoff;
    private final CharSet charSet = new CharSet(true);

    public not_spanish(String string, boolean ignoreSpaces, boolean ignorePunctuation) throws InterruptedException {
        this(string, ignoreSpaces, ignorePunctuation, 10, 7, false, false, 0);
    }
    public not_spanish(String string, boolean ignoreSpaces, boolean ignorePuncuation, int fromInclusive, int toInclusive, boolean optimize, boolean calculateCutoff, double Cutoff) throws InterruptedException {
        this.cutoff = Cutoff;
        if (ignorePuncuation) {
            string = charSet.removeIgnorers(string, new String[]{" "});
        }
        if (ignoreSpaces){
            string = string.replaceAll(" ", "");
        }
        if (calculateCutoff) {
            cutoff = calculateCutoff();
        }
        biggy = new BigArrayStoreSpanish();
        words = biggy.central();
        this.docLength = string.length();
        int validWords = 0;
        int wordsCounted = 0;
        boolean Break = false;
        for (int i = fromInclusive; i >= toInclusive; i--) {
            String[] split = charSet.split(string, i);
            for (String str : split) {
                wordsCounted++;
                for (String word : words) {
                    validityFactor = ((double) validWords) / ((double) wordsCounted);
                    this.not_spanish = validityFactor < cutoff;
                    if (str.equalsIgnoreCase(word)) {
                        validWords++;
                        break;
                    }
                    if (optimize) {
                        if (!not_spanish) {
                            Break = true;
                            this.validWords = validWords;
                            break;
                        }
                    }
                    if (optimize && Break){
                        break;
                    }
                }
            }
            if (optimize && Break){
                break;
            }
        }
    }
    public not_spanish(File file) throws FileNotFoundException {
        this(file, 0.5);
    }
    public not_spanish(String string){
        this(string, 0.5);
    }
    public not_spanish(File file, double cutoff) throws FileNotFoundException {
        biggy = new BigArrayStoreSpanish();
        words = biggy.central();
        int docLength = 0;
        Scanner counter = new Scanner(file);
        while (counter.hasNext()){if (counter.next() != null){docLength++;}}
        this.docLength = docLength;

        int validWords = 0;
        Scanner reader = new Scanner(file);
        while (reader.hasNext()) {
            if (words.contains(charSet.removeIgnorers(reader.next(), new String[]{""}))){
                validWords++;
            }
        }
        this.validWords = validWords;
        this.validityFactor = (double)validWords/(double)docLength;
        not_spanish = (validWords <= (cutoff*docLength));
    }
    public not_spanish(String string, double cutoff) {
        biggy = new BigArrayStoreSpanish();
        words = biggy.central();
        this.docLength = string.length();
        int validWords = 0;
        String[] split = string.split(" ");
        for (String word: split) {
            if (words.contains(charSet.removeIgnorers(word, new String[]{""}))){
                validWords++;
            }
        }
        this.validWords = validWords;
        this.validityFactor = (double)validWords/(double)docLength;
        not_spanish = (validWords <= (cutoff*docLength));
    }

    public double getCutoff() {
        return cutoff;
    }
    public double getValidityFactor() {return validityFactor;}
    public boolean not_spanish(){return not_spanish;}
    public int getValidWords(){return validWords;}
    public int getDocLength(){return docLength;}

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        test_not_spanish();

    }
    private static void test_not_spanish() throws FileNotFoundException {
        String[] pathnames = new String[]{"src/sample/document.txt", "src/sample/spanish.txt", "src/sample/russian.txt", "src/sample/obama.txt", "src/sample/belides_english.txt", "src/sample/orpheus_latin.txt", "src/sample/french.txt", "src/sample/stringStorer.txt"};
        for (String pathname : pathnames) {
            File document = new File(pathname);
            not_spanish not_spanish = new not_spanish(document);
            System.out.println(("\n\n" + pathname +
                    "\n" + not_spanish.not_spanish() +
                    "\n" + not_spanish.getDocLength() +
                    "\n" + not_spanish.getValidWords())+
                    "\n" + not_spanish.getValidityFactor());
        }
    }
    private double calculateCutoff() throws InterruptedException {
        //System.err.println("Spanish: Acurio, Gastón - "Discurso en la Universidad del Pacífico" - 2006");
        sample.not_spanish not_spanish = new not_spanish("""
                "Si bien podríamos pensar que los recursos naturales con los que cuenta nuestro país han sido una bendición, la historia nos ha enseñado siempre lo contrario. Alguna vez fue el caucho; otra vez, el guano; hoy son los minerales. Sin embargo, cuando estos se acaban, con ellos termina un ciclo económico de bonanza y aparece esa odiosa debacle e incertidumbre que destruye democracias y da origen a falsos caudillos.
                                
                Nos queda claro, entonces, que el crecimiento, la estabilidad y la riqueza de un país nunca estará del lado de los recursos naturales, sino de los productos que se elaboren con ellos. Por ello, los suizos compran recursos como el cacao o el oro y con ellos elaboran chocolates, joyas o relojes; y, por ello, los japoneses y los coreanos compran minerales para luego transformarlos en electrodomésticos y automóviles. Los ciudadanos de todos los países industrializados han entendido que la gran riqueza no está solo en la elaboración de productos genéricos, sino en la creación de marcas cuyo reconocimiento en términos de calidad les permite expandirse por todo el mundo. Por ello, Suiza compró cacao y oro, y sus ciudadanos los convirtieron en chocolates Nestlé y en relojes Rolex; Japón y Corea compraron minerales y su gente los convirtió en Toyota, Nissan o Samsung; y en épocas aún más recientes, el norteamericano Howard Shultz compró café por el mundo y se lo devolvió convertido en Starbucks.
                                
                Pues bien, la gastronomía peruana hasta hace muy poco ha sido justamente eso: un gran recurso. En efecto, ha sido un recurso muy querido por todos, un orgullo para todos, y muy apreciado por algunos extranjeros que descubrían anecdóticamente sus bondades en visitas de trabajo por el Perú. Sin embargo, nuestra gastronomía no es afortunadamente solo un gran recurso, sino una suma de cocinas y conceptos que, en muchos casos, aún esconden un gran potencial. Una vez desempolvado tal potencial y luego de haberse creado el marco conceptual y puesto en valor, los productos de la gastronomía peruana podrían ser exportados por todo el mundo.
                                
                Así es. Detrás de nuestra entrañable cocina criolla, de nuestras pollerías, de los chifitas de barrio, de la cocina novoandina, de las picanterías arequipeñas, de los anticuchos, de los sánguches, de la cocina nikkei o de las cebicherias, existen oportunidades inmensas de crear conceptos que trasciendan su ámbito local para convertirse en productos, productos peruanos de exportación que no solo aspiren a codearse con conceptos ya instalados globalmente como pizzerías, hamburgueserías, sushi bares o taquerías mejicanas, sino que, además, generen al Perú enormes beneficios tanto económicos como de marca país.
                Hasta aquí creo que podemos entender cómo nuestra gastronomía, un gran recurso, con productos con gran potencial, está lista para expandirse por el mundo; sin embargo, algo falta para el despegue final. ¿Qué sucede que aún no despegamos como quisiéramos?
                                
                Todos los estudios de mercado hechos fuera del Perú por empresas internacionales indican que el concepto culinario más en alza en el mundo es el peruano, que la demanda del consumidor internacional por conceptos peruanos rebasa largamente a su oferta, que invertir en un restaurante peruano bueno es invertir sin riesgo en cualquier ciudad norteamericana o europea.
                                
                Dentro del Perú hemos vivido una revolución editorial y educativa en términos culinarios que nos ha llevado a publicar en los últimos diez años más libros de cocina que en toda nuestra historia editorial previa. En Lima se han abierto, en los últimos 5 años, 22 escuelas de cocina reconocidas oficialmente, lo que la convierte en la ciudad con más escuelas de cocina en el mundo. Este año el 30 por ciento de los turistas que visitó el Perú para ir a Cuzco decidió quedarse en Lima un par de días adicionales solo por todo lo que había leído y escuchado acerca de su gastronomía. Los periodistas más importantes de todo el mundo son enviados a cubrir esta revolución culinaria y publican artículos y emiten programas de TV deslumbrados por lo que ellos consideran la inminente invasión peruana de sabores por todo el mundo. ¿Por qué a pesar de todos esos indicadores aún no se crean restaurantes peruanos en todas partes? La respuesta es más que evidente. Tenemos el recurso, disponemos de los productos. ¿Qué nos falta? Las marcas. Las marcas peruanas de productos culinarios peruanos por el mundo. Allí está la clave.
                                
                Algunos dirán que nos falta también el capital, los recursos financieros. Nosotros podemos rebatir ello contándoles que recibimos casi diariamente propuestas de inversionistas, desde Arabia Saudí hasta Australia, para invertir en restaurantes peruanos, propuestas que en su mayoría rechazamos porque creemos firmemente que todo tiene su momento, su espacio, su oportunidad.
                                
                Marcas peruanas, eso es lo que los cocineros y empresarios peruanos tenemos que lograr para que esos inversionistas no tengan una, sino muchas opciones para escoger a la hora de decidirse por uno u otro concepto. Necesitamos marcas que hayan desarrollado internamente todo aquello que hace que una pequeña gran idea, un pequeño gran sueño se traduzca en una filosofía poderosa que vaya creciendo poco a poco hasta convertirse en un modelo para estudiar, imitar, admirar, e incite a invertir.
                                
                En el caso de nuestra organización hemos venido desarrollando conceptos culinarios cuya aspiración, desde el comienzo, fue no solo su internacionalización, sino también su segmentación, pues entendimos desde el comienzo que los restaurantes no son escenarios genéricos sino espacios para públicos distintos, para momentos distintos, para economías distintas.
                                
                Cuando empezamos con el restaurante “Astrid y Gastón” hace doce años, lo hicimos con un capital de 45,000 dólares, prestados por familiares y amigos sin mucha fe, pero con un gran cariño hacia nosotros. Al cabo de 5 años, y luego de haber encontrado finalmente nuestra filosofía, después de habernos definido conceptualmente como restaurante de alta cocina peruana, lo que nos permitió ubicarnos en la cúspide de la pirámide de segmentación del mercado culinario, hicimos nuestra primera incursión fuera del país, en Chile, donde la cocina peruana ya tenía un gran reconocimiento. Los premios no tardaron en llegar, y luego vinieron Colombia, Ecuador, y, ahora, Venezuela, Panamá y México. Hoy cada uno de los locales ubicados en los mencionados países no solo es rentable, sino que, además, es reconocido como líder y referente de alta cocina en cada lugar. Así es: alta cocina peruana codo a codo con la francesa, la española, la italiana, etc. Como en algunos casos, las revoluciones empiezan de arriba hacia abajo, esto nos ha preparado el terreno para que nuestras otras marcas puedan ingresar con facilidad en otros segmentos avaladas por el prestigio generado por la anterior. Es más fácil conquistar corazones haciendo alta cocina y luego sánguches que haciendo sánguches y luego alta cocina.
                                
                Después nació “Tanta”, al que ubicamos dentro del segmento del restaurante familiar y lo definimos como el bistró o el deli de los peruanos, el lugar donde quien no podía pagar “Astrid y Gastón” podía sentir la misma filosofía y el mismo espíritu, pero en un ambiente informal y con precios asequibles, siempre con los sabores peruanos, pero siempre con originalidad, sofisticación y espíritu artesanal. Para nosotros hacer “Tanta” fue de alguna manera una catarsis, pues cada vez más “Astrid y Gastón” nos dejaba esa sensación de ser cocineros de elites pequeñas en un país de muchos y “Tanta” significaba justamente liberarnos de esas ataduras y poder mostrar a muchos todo aquello que queríamos decir con nuestro trabajo. Hoy tenemos tres locales en Lima, abrimos uno más este año y hemos terminado ya el proceso de elaboración de manuales, con lo cual ya está listo para ser exportado.
                                
                Luego vino “La Mar”. Si bien tengo muchas cebicherías favoritas, siempre sentí que todas carecían de una filosofía total que les permitiera competir con liderazgo en cualquier parte del mundo. Sentía mucha pena al ver cómo los peruanos habíamos devaluado un producto tan atractivo y sofisticado como nuestra cocina marina, relegándolo a categoría de “chingana” con sillas de plástico, sin servicio y con otras carencias notables. Y lo que era más grave, cuando algún empresario decidía mejorar sus instalaciones o mejorar el servicio, automáticamente quitaba el cartel de cebichería, para llamarlo restaurante de pescados y mariscos, sin darse cuenta de que era justamente ese nombre su mayor virtud, la que lo diferenciaba de las demás ofertas marinas que encontramos por el mundo.
                                
                Cebichería, peruvian seafood, eso fue lo que imaginamos como una realidad difundida por todas partes. Y, claro, lo demás era simple: había que aprovechar la enorme popularidad del cebiche por el mundo y crear una cebichería como concepto ubicado en el segmento étnico que compitiera internacionalmente con los sushi bares japoneses, con la convicción de que no eran ni mejores ni peores, sino simplemente distintos, con la diferencia de que frente a la solemnidad casi monacal del sushi bar, estaba el espíritu divertido y desenfadado de la cebichería. Había que mantener los elementos identificadores: la caña, el viento, la luz, pero con diseño. También era necesario mejorar y estandarizar la materia prima, crear una filosofía de servicio acorde con el ambiente alegre que debía de prevalecer, conservar los sabores con detalles de imaginación, y contar esa historia real de que los peruanos amamos el cebiche, y la cebichería es nuestro templo en todas partes.
                                
                Hoy estamos abriendo el segundo “La Mar” en Lima y ya hemos vendido franquicias de este concepto en México, toda Centroamérica y el Caribe, y Brasil. Para el año 2007 esperamos iniciar las actividades de esta marca en Inglaterra y Washington. Creemos firmemente, por muchas razones, que la cebichería peruana es el concepto que se expandirá más rápidamente por todo el mundo.
                                
                ¿Cuál es nuestra cuarta marca? Cuando uno pregunta a diez peruanos si les gusta el pan con chicharrón, los diez dicen que sí. Cuando uno pregunta si les gustan las hamburguesas, la cifra baja a 5 ó 6. Sin embargo, cuando uno repregunta cuántos panes con chicharrón o cuántas hamburguesas ha comido durante la semana, estas últimas siempre terminan ganando. Por haber conocido y analizado esta realidad, entendimos claramente el mensaje. El problema no era nuestro sánguche, el problema era que no había una marca que pudiera salirles al frente a las cadenas de comida rápida con una propuesta que, a partir de nuestras tradiciones sangucheras, pudiera crear un escenario que satisficiera las aspiraciones de nuestra gente.
                                
                En estos momentos estamos por inaugurar la sanguchería “Pasquale hermanos” para ubicarse dentro del segmento de comidas rápidas, para que, sin renunciar a su espíritu artesanal, sino más bien haciendo de ello una ventaja, compita directamente con las marcas de comida rápida internacionales con un concepto netamente peruano. Allí existirá un escenario ad hoc, unos protagonistas, los hermanos Pasquale, primos de los Carbone, los Cordano, los Queirolo, los Palermo, fundadores de las sangucherías limeñas, pero donde el peruano sentirá que finalmente el sánguche peruano dejó de ser una aventura mensual y valiente, y se hará parte de su vida cotidiana. Lo que nos inspira es la ilusión de que este segmento de mercado se reacomode y dé cabida a una propuesta netamente nacional.
                                
                Esperamos abrir muchos “Pasquale” en Lima y su internacionalización dependerá del éxito de las cebicherías, los bistrós peruanos, y otros conceptos que harán de la marca genérica Perú lo suficientemente fuerte como para que “Pasquale” tenga el camino expedito.
                                
                Estamos ahora en busca del local para construir nuestra quinta marca: “Panchita”. Durante siglos, las anticucheras de las esquinas formaron parte del ornato y la identidad de nuestra ciudad y, por cierto, del atractivo hacia el turista. Sin embargo, en los últimos años autoridades equivocadas las persiguieron argumentando razones sanitarias, en vez de darles las herramientas para que estuvieran de acuerdo con los tiempos, al punto que hoy es casi imposible encontrar una anticuchera de aquellas que daban vida y aroma a nuestras esquinas. Paradójicamente en cada una de esas esquinas han abierto pequeños negocios de hamburguesas o pollos broaster con costumbres sanitarias mucho más cuestionables que las de nuestras doñas Panchitas de antaño y que, además, en nada podrían cautivar al extranjero que nos visita.
                                
                Es con tal espíritu reivindicador con el que nace “Panchita”, como un homenaje a esa tradición y a todas esas anticucheras que alguna vez adornaron la ciudad. Anticuchería, pero convertida en un restaurante de verdad, con servicio, con diseño, con filosofía propia; anticuchería que será vendida al mundo como la parrilla de los peruanos, y que nace con la vocación internacional de competir directamente con las parrillas argentinas y los rodizios brasileños, pero todo en el mundo del anticucho, dentro de un marco festivo y con decoración que recuerda a las haciendas peruanas, con anticucheras robustas en vez de parrilleros gauchos, con parrillas como las de las esquinas, con huancaínas y cremas en vez de chimichurris, con 25 tipos de anticuchos con todos los sabores, desde el clásico de corazón hasta el sofisticado de atún, con yuca frita, papas doradas, choclos y tacu tacus en vez de papas fritas, con música latina en vez de tangos, con una fiesta de sabores peruanos en vez de una sola pieza de carne de 500 gramos. La anticuchera de la esquina, pues, quedará convertida en restaurante. Su internacionalización dependerá del éxito de las cebicherías.
                                
                Estamos en proceso de creación de tres marcas más. La primera es la de un chifa, pero que sea el real reflejo de una fusión peruano-china y no de un restaurante chino con toques peruanos. Hoy el Perú cuenta con 5,000 chifas; sin embargo, no tenemos ninguna marca. Deberemos crear decoración, ambiente, música, filosofía de servicio, y comida, por cierto, comida que sea el reflejo de un auténtico mestizaje peruano-chino, cuya diferenciación de lo chino será la clave para su internacionalización.
                                
                Estamos también en proceso de creación de la pollería de nuestros sueños, donde las guarniciones peruanas harán la diferencia frente al roasted chicken de otros lares, y donde la brasa que le da todo el sabor original, y que lamentablemente algunos comercios hoy devalúan llamándolo brasa cuando usan gas, será lo que marque la diferencia y el sello de roasted chicken peruvian style.
                                
                Crearemos también una cadena de hoteles boutique en lugares paradisíacos de nuestro país, con un espíritu peruano latino, donde el diseño, el buen precio, el servicio esmerado y, a la vez, espontáneo y la gran cocina avalada por nuestras marcas serán la clave de su crecimiento y de su internacionalización.
                                
                Finalmente hemos terminado de desarrollar lo que es el comienzo de nuestra división industrial. Tenemos claro que, en un futuro, el desarrollo de la cocina peruana, no solo en restaurantes orientados al extranjero, sino también en los hábitos de consumo internacionales, generará una demanda de bases de sabor, salsas, productos derivados que simplifiquen el camino a la hora de preparar un cebiche, un tiradito, una causa y demás. Hemos desarrollado ya las fórmulas: solo nos queda esperar que el mercado esté listo para recibirlas en una marca que tenga como aliado estratégico a un productor emprendedor de Virú, con quien ya contamos, y un distribuidor apasionado, peruano también, quien ya está listo para asumir su función.
                                
                Me imagino que ustedes y mucha gente se preguntará por qué tanta fe. En realidad no es fe, es simplemente resultado de un análisis concreto. En los años 80 se dio el inicio del gran despegue de la cocina mejicana por el mundo. En aquel entonces no había Internet, ni las economías estaban globalizadas, ni las barreras culturales habían sido quebradas, ni las fusiones estaban de moda. En ese momento, los mejicanos salieron al mundo con sus tacos y sus tequilas, convencidos de que con ello conquistarían a todos.
                                
                En aquel entonces habría unos 500 restaurantes mejicanos. Hoy debe haber más de 200,000. Con ello no solo lograron introducir dicho concepto, sino que también lograron poner de moda el tequila, la cerveza Corona, las salsas derivadas que hoy vemos en todos los supermercados y, por supuesto, el chile. La difusión del chile llegó a tal punto, que hoy nuestro valle de Virú tiene que producir chile jalapeño porque el agro mejicano no es suficiente para abastecer la demanda mundial.
                                
                Con los japoneses sucedió lo mismo. A inicios de los ochenta no había sushi bares por el mundo. Hoy hay más de 50,000, y, gracias a ellos, pudieron entrar no solo productos sino otros conceptos como el teppanyakki, del benihana, o los noodle bars tan de moda en Europa.
                                
                Entonces, si hoy las barreras culturales ya no existen, si el Internet está al servicio de todos los conocimientos culinarios internacionales, si las economías se han globalizado irreversiblemente, si los estudios, la prensa internacional y el consumidor foráneo nos dan permanentes señales de estar esperándonos, y si, además, contamos no con un producto, sino con muchos productos mucho más diversos, sofisticados y divertidos que ofrecer, ¿por qué creer que vamos a fracasar en el intento? Nuestra fe nace del análisis, no de la ilusión, y nuestra fuerza, eso sí, nace del deber, de la convicción de que los cocineros somos actores reales de los procesos de cambio que el Perú necesita. Creemos firmemente que el éxito de los restaurantes peruanos por el mundo traerá consigo muchísimos beneficios directos e indirectos para el país.
                                
                Imaginamos de aquí a veinte años un escenario donde existan, al igual que hoy hay mejicanos, unos 200,000 restaurantes peruanos de todo tipo y en todas partes. Supongamos que, cuando caminemos por cualquier ciudad europea, encontraremos una anticuchería al lado de una pizzería, una sanguchería al lado de una hamburguesería, una cebichería al lado de un sushi bar o un restaurante criollo al lado de un tex mex. Si somos capaces de concebir esa realidad, entonces podremos imaginarnos todos los beneficios que aquel escenario traerá consigo.
                                
                La demanda de productos tan comunes como papa amarilla, ají, cebolla roja, rocoto o limón se multiplicaría infinitamente y con ello acabaríamos con uno de los más dolorosos males que padece nuestro país y que genera tanto enfrentamiento aprovechado coyunturalmente por falsos profetas: el empobrecimiento del campesino peruano en los Andes. Hoy, para solo darles un ejemplo, el kilo de papa amarilla se vende en Europa en mercados étnicos a 5 euros el kilo. En contraste, por lo mismo al campesino peruano se le pagan solo 30 céntimos de sol en chacra. Con el nuevo escenario, esto cambiaría y, con ello, desaparecería un permanente caldo de cultivo para la inestabilidad del país.
                                
                En dicho escenario se generarían también muchas industrias y productos de base de sabor, como la que venimos desarrollando, de salsas, de pisco, de libros, de revistas, de turismo gastronómico, de asesoramiento gastronómico, de snacks, de dips y todo aquello que va naciendo alrededor de conceptos como los que tenemos. Italia, por ejemplo, exporta productos por 5,000 millones de dólares solo porque un concepto llamado pizza existe por todo el mundo. Esto es más que elocuente para imaginar lo que podríamos generar en torno a toda nuestra gama de conceptos. Quizás lograríamos una cifra mucho mayor que esa.
                                
                Por último, el hecho de tener estos conceptos y marcas por el mundo, le daría a la marca Perú un poder de seducción que no solo llamaría la atención del público internacional hacia otras propuestas peruanas, como la moda, el diseño, la joyería, la música, la industria y demás, sino que también incentivaría y activaría la creatividad y la confianza de nuestros jóvenes para elaborar conceptos propios y tener la valentía de salir al mundo con ellos.
                                
                Por estas razones creemos que los cocineros tenemos muchas cosas que decir: además de cocinar, tenemos una enorme responsabilidad como miembros de una generación a la que se ha dado con mucha generosidad la oportunidad de representar a su país en aquello que tiene de más poderoso: su gastronomía; en aquello que el mercado hoy más valora y aprecia de nosotros; en aquello que puede generar enormes cambios no solo económicos, sino sobre todo en la manera como los peruanos debemos encarar nuestro futuro personal y el futuro del Perú.
                                
                Los peruanos debemos buscar la riqueza dentro de nosotros mismos: estamos llenos de oportunidades por todas partes esperando a alguien que les dé el valor y la fuerza necesarios para convertirlas en algo atractivo y poderoso para vender al mundo.
                                
                La clave está en entender que somos una gran nación, con una gran cultura viva, fruto de siglos de mestizaje, y que es justamente ese mestizaje el que ha hecho de nuestra cocina una propuesta variada y diversa que ha cautivado finalmente al público internacional. Es en ese mestizaje donde los peruanos debemos encontrar la fuente de inspiración no solo para generar riqueza, sino sobre todo para aceptarnos y querernos como nación. Solo a partir de ello podremos encontrar dentro de nosotros todas aquellas ideas que luego saldrán transformadas en productos y en marcas para conquistar el planeta.
                                
                Hoy estoy aquí muy emocionado por el hecho de poder dirigirme a ustedes no solo para contarles todas estas cosas, sino para recordarles que, como yo, son ustedes los jóvenes más afortunados de este país. Que son aquellos a quienes la suerte les concedió haber nacido en una familia que los pudo educar con amor en un país donde muchos niños ni siquiera conocen el amor. Ustedes, hoy y aquí, están recibiendo la mejor educación, como la que yo recibí y como la que hoy reciben mis hijas, mientras muchas otras niñas en vez de ir a la escuela tienen que trabajar.
                                
                Esto no solo debe indignarnos como ciudadanos de un país al que amamos y en el que queremos crear riqueza y logros personales, sino que debe convertirnos en actores para revertir para siempre esta situación y llevarnos finalmente a construir un país próspero lleno de riqueza, donde sintamos orgullo de formar parte de una nación en la que las oportunidades están basadas en una educación igual para todos, en la que existe una justicia igual para todos y un Estado que, de la mano con sus ciudadanos, vigila e interviene enérgicamente frente a la arbitrariedad, el abuso y el rompimiento de las reglas de juego pactadas por todos.
                                
                Créanme, solo es posible cumplir sus sueños personales si tenemos un sueño nacional anterior. El éxito personal solo llegará si nuestros objetivos trascienden al ámbito individual para formar parte de una gran aspiración colectiva. Japón reconstruyó su país en ruinas para convertirse en la potencia de hoy porque antes que individuos eran japoneses. Alemania hizo lo mismo, Israel también, al igual que naciones mucho más jóvenes como Australia o Nueva Zelanda.
                                
                Es en ese espíritu nacional, pero el positivo, el que se abre al mundo, el que se cuestiona, el que tolera, el que abraza, el que integra, el que aplaude el éxito y no en el nacionalismo que se lamenta, que condena, que divide, que se encierra y protege la mediocridad, en donde finalmente los peruanos alcanzaremos el rostro definitivo de nuestra nación y con él la tan ansiada prosperidad.
                                
                Para terminar quisiera decirles, en realidad pedirles, que no se vayan del Perú: ustedes son sus hijos más afortunados, sus hijos más preparados. Si salen a estudiar una maestría, regresen. No se vayan: es aquí donde están las oportunidades, es aquí donde está la riqueza, es aquí donde la vida encuentra un sentido. No se vayan porque su pueblo los necesita; el Perú los necesita; la historia los necesita.
                                
                Muchas gracias."
                                
                """,true, true);
        //Thread.sleep(2000);
        //System.err.println("Latin - In Catilinam Cicerone");
        sample.not_spanish not_spanish1 = new not_spanish("""

                [4] II. Decrevit quondam senatus, ut L. Opimius consul videret, ne quid res publica detrimenti caperet; nox nulla intercessit; interfectus est propter quasdam seditionum suspiciones C. Gracchus, clarissimo patre, avo, maioribus, occisus est cum liberis M. Fulvius consularis. Simili senatus consulto C. Mario et L. Valerio consulibus est permissa res publica; num unum diem postea L. Saturninum tribunum pl. et C. Servilium praetorem mors ac rei publicae poena remorata est? At [vero] nos vicesimum iam diem patimur hebescere aciem horum auctoritatis. Habemus enim huiusce modi senatus consultum, verum inclusum in tabulis tamquam in vagina reconditum, quo ex senatus consulto confestim te interfectum esse, Catilina, convenit. Vivis, et vivis non ad deponendam, sed ad confirmandam audaciam. Cupio, patres conscripti, me esse clementem, cupio in tantis rei publicae periculis me non dissolutum videri, sed iam me ipse inertiae nequitiaeque condemno.




                [5] Castra sunt in Italia contra populum Romanum in Etruriae faucibus conlocata, crescit in dies singulos hostium numerus; eorum autem castrorum imperatorem ducemque hostium intra moenia atque adeo in senatu videtis intestinam aliquam cotidie perniciem rei publicae molientem. Si te iam, Catilina, comprehendi, si interfici iussero, credo, erit verendum mihi, ne non potius hoc omnes boni serius a me quam quisquam crudelius factum esse dicat. Verum ego hoc, quod iam pridem factum esse oportuit, certa de causa nondum adducor ut faciam. Tum denique interficiere, cum iam nemo tam inprobus, tam perditus, tam tui similis inveniri poterit, qui id non iure factum esse fateatur. [6] Quamdiu quisquam erit, qui te defendere audeat, vives, et vives ita, ut [nunc] vivis, multis meis et firmis praesidiis obsessus, ne commovere te contra rem publicam possis. Multorum te etiam oculi et aures non sentientem, sicut adhuc fecerunt, speculabuntur atque custodient.

                III. Etenim quid est, Catilina, quod iam amplius expectes, si neque nox tenebris obscurare coetus nefarios nec privata domus parietibus continere voces coniurationis tuae potest, si illustrantur, si erumpunt omnia? Muta iam istam mentem, mihi crede, obliviscere caedis atque incendiorum. Teneris undique; luce sunt clariora nobis tua consilia omnia; quae iam mecum licet recognoscas.

                [7] Meministine me ante diem XII Kalendas Novembris dicere in senatu fore in armis certo die, qui dies futurus esset ante diem VI Kal. Novembris, C. Manlium, audaciae satellitem atque administrum tuae? Num me fefellit, Catilina, non modo res tanta, tam atrox tamque incredibilis, verum, id quod multo magis est admirandum, dies? Dixi ego idem in senatu caedem te optumatium contulisse in ante diem V Kalendas Novembris, tum cum multi principes civitatis Roma non tam sui conservandi quam tuorum consiliorum reprimendorum causa profugerunt. Num infitiari potes te illo ipso die meis praesidiis, mea diligentia circumclusum commovere te contra rem publicam non potuisse, cum tu discessu ceterorum nostra tamen, qui remansissemus, caede te contentum esse dicebas?

                [8] Quid? cum te Praeneste Kalendis ipsis Novembribus occupaturum nocturno impetu esse confideres, sensistine illam coloniam meo iussu meis praesidiis, custodiis, vigiliis esse munitam? Nihil agis, nihil moliris, nihil cogitas, quod non ego non modo audiam, sed etiam videam planeque sentiam. IV. Recognosce tandem mecum noctem illam superiorem; iam intelleges multo me vigilare acrius ad salutem quam te ad perniciem rei publicae. Dico te priore nocte venisse inter falcarios--non agam obscure--in M. Laecae domum; convenisse eodem complures eiusdem amentiae scelerisque socios. Num negare audes? quid taces? Convincam, si negas. Video enim esse hic in senatu quosdam, qui tecum una fuerunt.

                [9] O di inmortales! ubinam gentium sumus? in qua urbe vivimus? quam rem publicam habemus? Hic, hic sunt in nostro numero, patres conscripti, in hoc orbis terrae sanctissimo gravissimoque consilio, qui de nostro omnium interitu, qui de huius urbis atque adeo de orbis terrarum exitio cogitent! Hos ego video consul et de re publica sententiam rogo et, quos ferro trucidari oportebat, eos nondum voce volnero!

                Fuisti igitur apud Laecam illa nocte, Catilina, distribuisti partes Italiae, statuisti, quo quemque proficisci placeret, delegisti, quos Romae relinqueres, quos tecum educeres, discripsisti urbis partes ad incendia, confirmasti te ipsum iam esse exiturum, dixisti paulum tibi esse etiam nunc morae, quod ego viverem. Reperti sunt duo equites Romani, qui te ista cura liberarent et sese illa ipsa nocte paulo ante lucem me in meo lectulo interfecturos [esse] pollicerentur. [10] Haec ego omnia vixdum etiam coetu vestro dimisso comperi; domum meam maioribus praesidiis munivi atque firmavi, exclusi eos, quos tu ad me salutatum mane miseras, cum illi ipsi venissent, quos ego iam multis ac summis viris ad me id temporis venturos esse praedixeram.

                V. Quae cum ita sint, Catilina, perge, quo coepisti, egredere aliquando ex urbe; patent portae; proficiscere. Nimium diu te imperatorem tua illa Manliana castra desiderant. Educ tecum etiam omnes tuos, si minus, quam plurimos; purga urbem. Magno me metu liberabis, dum modo inter me atque te murus intersit. Nobiscum versari iam diutius non potes; non feram, non patiar, non sinam. [11] Magna dis inmortalibus habenda est atque huic ipsi Iovi Statori, antiquissimo custodi huius urbis, gratia, quod hanc tam taetram, tam horribilem tamque infestam rei publicae pestem totiens iam effugimus.

                Non est saepius in uno homine summa salus periclitanda rei publicae. Quamdiu mihi consuli designato, Catilina, insidiatus es, non publico me praesidio, sed privata diligentia defendi. Cum proximis comitiis consularibus me consulem in campo et competitores tuos interficere voluisti, compressi conatus tuos nefarios amicorum praesidio et copiis nullo tumultu publice concitato; denique, quotienscumque me petisti, per me tibi obstiti, quamquam videbam perniciem meam cum magna calamitate rei publicae esse coniunctam.

                [12] Nunc iam aperte rem publicam universam petis, templa deorum inmortalium, tecta urbis, vitam omnium civium, Italiam [denique] totam ad exitium et vastitatem vocas. Quare, quoniam id, quod est primum, et quod huius imperii disciplinaeque maiorum proprium est, facere nondum audeo, faciam id, quod est ad severitatem lenius et ad communem salutem utilius. Nam si te interfici iussero, residebit in re publica reliqua coniuratorum manus; sin tu, quod te iam dudum hortor, exieris, exhaurietur ex urbe tuorum comitum magna et perniciosa sentina rei publicae. [13] Quid est, Catilina? num dubitas id me imperante facere, quod iam tua sponte faciebas? Exire ex urbe iubet consul hostem. Interrogas me, num in exilium; non iubeo, sed, si me consulis, suadeo.

                VI. Quid est enim, Catilina, quod te iam in hac urbe delectare possit? in qua nemo est extra istam coniurationem perditorum hominum, qui te non metuat, nemo, qui non oderit.

                Quae nota domesticae turpitudinis non inusta vitae tuae est? quod privatarum rerum dedecus non haeret in fama? quae lubido ab oculis, quod facinus a manibus umquam tuis, quod flagitium a toto corpore afuit? cui tu adulescentulo, quem corruptelarum inlecebris inretisses, non aut ad audaciam ferrum aut ad lubidinem facem praetulisti? [14] Quid vero? nuper cum morte superioris uxoris novis nuptiis domum vacuefecisses, nonne etiam alio incredibili scelere hoc scelus cumulasti? quod ego praetermitto et facile patior sileri, ne in hac civitate tanti facinoris inmanitas aut extitisse aut non vindicata esse videatur. Praetermitto ruinas fortunarum tuarum, quas omnis inpendere tibi proxumis Idibus senties; ad illa venio, quae non ad privatam ignominiam vitiorum tuorum, non ad domesticam tuam difficultatem ac turpitudinem sed ad summam rem publicam atque ad omnium nostrum vitam salutemque pertinent. [15] Potestne tibi haec lux, Catilina, aut huius caeli spiritus esse iucundus, cum scias esse horum neminem, qui nesciat te pridie Kalendas Ianuarias Lepido et Tullo consulibus stetisse in comitio cum telo, manum consulum et principum civitatis interficiendorum causa paravisse, sceleri ac furori tuo non mentem aliquam aut timorem tuum sed fortunam populi Romani obstitisse?

                Ac iam illa omitto--neque enim sunt aut obscura aut non multa commissa postea--quotiens tu me designatum, quotiens consulem interficere conatus es! quot ego tuas petitiones ita coniectas, ut vitari posse non viderentur, parva quadam declinatione et, ut aiunt, corpore effugi! nihil [agis, nihil] adsequeris [, nihil moliris] neque tamen conari ac velle desistis. [16] Quotiens tibi iam extorta est ista sica de manibus, quotiens [vero] excidit casu aliquo et elapsa est! [tamen ea carere diutius non potes] quae quidem quibus abs te initiata sacris ac devota sit, nescio, quod eam necesse putas esse in consulis corpore defigere.

                VII. Nunc vero quae tua est ista vita? Sic enim iam tecum loquar, non ut odio permotus esse videar, quo debeo, sed ut misericordia, quae tibi nulla debetur. Venisti paulo ante in senatum. Quis te ex hac tanta frequentia totque tuis amicis ac necessariis salutavit? Si hoc post hominum memoriam contigit nemini, vocis expectas contumeliam, cum sis gravissimo iudicio taciturnitatis oppressus? Quid, quod adventu tuo ista subsellia vacuefacta sunt, quod omnes consulares, qui tibi persaepe ad caedem constituti fuerunt, simul atque adsedisti, partem istam subselliorum nudam atque inanem reliquerunt, quo tandem animo [hoc] tibi ferundum putas?

                [17] Servi mehercule mei si me isto pacto metuerent, ut te metuunt omnes cives tui, domum meam relinquendam putarem; tu tibi urbem non arbitraris? et, si me meis civibus iniuria suspectum tam graviter atque offensum viderem, carere me aspectu civium quam infestis omnium oculis conspici mallem; tu cum conscientia scelerum tuorum agnoscas odium omnium iustum et iam diu tibi debitum, dubitas, quorum mentes sensusque volneras, eorum aspectum praesentiamque vitare? Si te parentes timerent atque odissent tui neque eos ulla ratione placare posses, ut opinor, ab eorum oculis aliquo concederes. Nunc te patria, quae communis est parens omnium nostrum, odit ac metuit et iam diu nihil te iudicat nisi de parricidio suo cogitare; huius tu neque auctoritatem verebere nec iudicium sequere nec vim pertimesces?

                [18] Quae tecum, Catilina, sic agit et quodam modo tacita loquitur: "Nullum iam aliquot annis facinus exstitit nisi per te, nullum flagitium sine te; tibi uni multorum civium neces, tibi vexatio direptioque sociorum inpunita fuit ac libera; tu non solum ad neglegendas leges et quaestiones, verum etiam ad evertendas perfringendasque valuisti. Superiora illa, quamquam ferenda non fuerunt, tamen, ut potui, tuli; nunc vero me totam esse in metu propter unum te, quicquid increpuerit, Catilinam timeri, nullum videri contra me consilium iniri posse, quod a tuo scelere abhorreat, non est ferendum. Quam ob rem discede atque hunc mihi timorem eripe; si est verus, ne opprimar, sin falsus, ut tandem aliquando timere desinam."

                [19] VIII. Haec si tecum, ita ut dixi, patria loquatur, nonne impetrare debeat, etiamsi vim adhibere non possit? Quid, quod tu te ipse in custodiam dedisti, quod vitandae suspicionis causa ad M'. Lepidum te habitare velle dixisti? A quo non receptus etiam ad me venire ausus es atque, ut domi meae te adservarem, rogasti. Cum a me quoque id responsum tulisses, me nullo modo posse isdem parietibus tuto esse tecum, qui magno in periculo essem, quod isdem moenibus contineremur, ad Q. Metellum praetorem venisti. A quo repudiatus ad sodalem tuum, virum optumum, M. Metellum, demigrasti; quem tu videlicet et ad custodiendum diligentissimum et ad suspicandum sagacissimum et ad vindicandum fortissimum fore putasti. Sed quam longe videtur a carcere atque a vinculis abesse debere, qui se ipse iam dignum custodia iudicarit!

                [20] Quae cum ita sint, Catilina, dubitas, si emori aequo animo non potes, abire in aliquas terras et vitam istam multis suppliciis iustis debitisque ereptam fugae solitudinique mandare? "Refer" inquis "ad senatum"; id enim postulas et, si hic ordo [sibi] placere decreverit te ire in exilium, optemperaturum te esse dicis. Non referam, id quod abhorret a meis moribus, et tamen faciam, ut intellegas, quid hi de te sentiant. Egredere ex urbe, Catilina, libera rem publicam metu, in exilium, si hanc vocem exspectas, proficiscere. Quid est, Catilina? ecquid attendis, ecquid animadvertis horum silentium? Patiuntur, tacent. Quid exspectas auctoritatem loquentium, quorum voluntatem tacitorum perspicis?

                [21] At si hoc idem huic adulescenti optimo, P. Sestio, si fortissimo viro, M. Marcello, dixissem, iam mihi consuli hoc ipso in templo iure optimo senatus vim et manus intulisset. De te autem, Catilina, cum quiescunt, probant, cum patiuntur, decernunt, cum tacent, clamant, neque hi solum, quorum tibi auctoritas est videlicet cara, vita vilissima, sed etiam illi equites Romani, honestissimi atque optimi viri, ceterique fortissimi cives, qui circumstant senatum, quorum tu et frequentiam videre et studia perspicere et voces paulo ante exaudire potuisti. Quorum ego vix abs te iam diu manus ac tela contineo, eosdem facile adducam, ut te haec, quae vastare iam pridem studes, relinquentem usque ad portas prosequantur.

                [22] IX. Quamquam quid loquor? te ut ulla res frangat, tu ut umquam te corrigas, tu ut ullam fugam meditere, tu ut ullum exilium cogites? Utinam tibi istam mentem di inmortales duint! tametsi video, si mea voce perterritus ire in exilium animum induxeris quanta tempestas invidiae nobis, si minus in praesens tempus recenti memoria scelerum tuorum, at in posteritatem impendeat. Sed est tanti, dum modo ista sit privata calamitas et a rei publicae periculis seiungatur. Sed tu ut vitiis tuis commoveare, ut legum poenas pertimescas, ut temporibus rei publicae cedas, non est postulandum. Neque enim is es, Catilina, ut te aut pudor umquam a turpitudine aut metus a periculo aut ratio a furore revocarit.

                [23] Quam ob rem, ut saepe iam dixi, proficiscere ac, si mihi inimico, ut praedicas, tuo conflare vis invidiam, recta perge in exilium; vix feram sermones hominum, si id feceris, vix molem istius invidiae, si in exilium iussu consulis ieris, sustinebo. Sin autem servire meae laudi et gloriae mavis, egredere cum inportuna sceleratorum manu, confer te ad Manlium, concita perditos cives, secerne te a bonis, infer patriae bellum, exsulta impio latrocinio, ut a me non eiectus ad alienos, sed invitatus ad tuos isse videaris.

                [24] Quamquam quid ego te invitem, a quo iam sciam esse praemissos, qui tibi ad Forum Aurelium praestolarentur armati, cui iam sciam pactam et constitutam cum Manlio diem, a quo etiam aquilam illam argenteam, quam tibi ac tuis omnibus confido perniciosam ac funestam futuram, cui domi tuae sacrarium [scelerum tuorum] constitutum fuit, sciam esse praemissam? Tu ut illa carere diutius possis, quam venerari ad caedem proficiscens solebas, a cuius altaribus saepe istam impiam dexteram ad necem civium transtulisti?

                [25] X. Ibis tandem aliquando, quo te iam pridem ista tua cupiditas effrenata ac furiosa rapiebat; neque enim tibi haec res adfert dolorem, sed quandam incredibilem voluptatem. Ad hanc te amentiam natura peperit, voluntas exercuit, fortuna servavit. Numquam tu non modo otium, sed ne bellum quidem nisi nefarium concupisti. Nactus es ex perditis atque ab omni non modo fortuna, verum etiam spe derelictis conflatam inproborum manum. [26] Hic tu qua laetitia perfruere, quibus gaudiis exultabis, quanta in voluptate bacchabere, cum in tanto numero tuorum neque audies virum bonum quemquam neque videbis! Ad huius vitae studium meditati illi sunt, qui feruntur, labores tui, iacere humi non solum ad obsidendum stuprum, verum etiam ad facinus obeundum, vigilare non solum insidiantem somno maritorum, verum etiam bonis otiosorum. Habes, ubi ostentes tuam illam praeclaram patientiam famis, frigoris, inopiae rerum omnium, quibus te brevi tempore confectum esse senties. [27] Tantum profeci tum, cum te a consulatu reppuli, ut exsul potius temptare quam consul vexare rem publicam posses, atque ut id, quod esset a te scelerate susceptum, latrocinium potius quam bellum nominaretur.

                XI. Nunc, ut a me, patres conscripti, quandam prope iustam patriae querimoniam detester ac deprecer, percipite, quaeso, diligenter, quae dicam, et ea penitus animis vestris mentibusque mandate. Etenim, si mecum patria, quae mihi vita mea multo est carior, si cuncta Italia, si omnis res publica loquatur:

                "M.Tulli, quid agis? Tune eum, quem esse hostem comperisti, quem ducem belli futurum vides, quem expectari imperatorem in castris hostium sentis, auctorem sceleris, principem coniurationis, evocatorem servorum et civium perditorum, exire patiere, ut abs te non emissus ex urbe, sed immissus in urbem esse videatur? Nonne hunc in vincla duci, non ad mortem rapi, non summo supplicio mactari imperabis? [28] Quid tandem te impedit? mosne maiorum? At persaepe etiam privati in hac re publica perniciosos cives morte multarunt. An leges, quae de civium Romanorum supplicio rogatae sunt? At numquam in hac urbe, qui a re publica defecerunt, civium iura tenuerunt. An invidiam posteritatis times? Praeclaram vero populo Romano refers gratiam, qui te, hominem per te cognitum nulla commendatione maiorum tam mature ad summum imperium per omnis honorum gradus extulit, si propter invidiam aut alicuius periculi metum salutem civium tuorum neglegis. [29] Sed, si quis est invidiae metus, non est vehementius severitatis ac fortitudinis invidia quam inertiae ac nequitiae pertimescenda. An, cum bello vastabitur Italia, vexabuntur urbes, tecta ardebunt tum te non existumas invidiae incendio conflagraturum?"

                XII. His ego sanctissimis rei publicae vocibus et eorum hominum, qui hoc idem sentiunt, mentibus pauca respondebo. Ego si hoc optimum factu iudicarem, patres conscripti, Catilinam morte multari, unius usuram horae gladiatori isti ad vivendum non dedissem. Etenim si summi viri et clarissimi cives Saturnini et Gracchorum et Flacci et superiorum complurium sanguine non modo se non contaminarunt, sed etiam honestarunt, certe verendum mihi non erat, ne quid hoc parricida civium interfecto invidiae [mihi] in posteritatem redundaret. Quodsi ea mihi maxime inpenderet tamen hoc animo fui semper, ut invidiam virtute partam gloriam, non invidiam putarem.

                [30] Quamquam non nulli sunt in hoc ordine, qui aut ea, quae inminent non videant aut ea, quae vident, dissimulent; qui spem Catilinae mollibus sententiis aluerunt coniurationemque nascentem non credendo corroboraverunt; quorum auctoritate multi non solum improbi, verum etiam inperiti, si in hunc animadvertissem, crudeliter et regie factum esse dicerent. Nunc intellego, si iste, quo intendit, in Manliana castra pervenerit, neminem tam stultum fore, qui non videat coniurationem esse factam, neminem tam improbum qui non fateatur. Hoc autem uno interfecto intellego hanc rei publicae pestem paulisper reprimi, non in perpetuum comprimi posse. Quodsi se eiecerit secumque suos eduxerit et eodem ceteros undique collectos naufragos adgregarit, extinguetur atque delebitur non modo haec tam adulta rei publicae pestis, verum etiam stirps ac semen malorum omnium.

                [31] Etenim iam diu, patres conscripti, in his periculis coniurationis insidiisque versamur, sed nescio quo pacto omnium scelerum ac veteris furoris et audaciae maturitas in nostri consulatus tempus erupit. Quodsi ex tanto latrocinio iste unus tolletur, videbimur fortasse ad breve quoddam tempus cura et metu esse relevati, periculum autem residebit et erit inclusum penitus in venis atque in visceribus rei publicae. Ut saepe homines aegri morbo gravi cum aestu febrique iactantur, si aquam gelidam biberunt, primo relevari videntur, deinde multo gravius vehementiusque adflictantur, sic hic morbus, qui est in re publica, relevatus istius poena vehementius reliquis vivis ingravescet.

                [32] Quare secedant inprobi, secernant se a bonis, unum in locum congregentur, muro denique, [id] quod saepe iam dixi, secernantur a nobis; desinant insidiari domi suae consuli, circumstare tribunal praetoris urbani, obsidere cum gladiis curiam, malleolos et faces ad inflammandam urbem comparare; sit denique inscriptum in fronte unius cuiusque, quid de re publica sentiat. Polliceor hoc vobis, patres conscripti, tantam in nobis consulibus fore diligentiam, tantam in vobis auctoritatem, tantam in equitibus Romanis virtutem, tantam in omnibus bonis consensionem, ut Catilinae profectione omnia patefacta, inlustrata, oppressa, vindicata esse videatis.

                [33] Hisce ominibus, Catilina, cum summa rei publicae salute, cum tua peste ac pernicie cumque eorum exitio, qui se tecum omni scelere parricidioque iunxerunt, proficiscere ad impium bellum ac nefarium. Tu, Iuppiter, qui isdem quibus haec urbs auspiciis a Romulo es constitutus, quem Statorem huius urbis atque imperii vere nominamus, hunc et huius socios a tuis [aris] ceterisque templis, a tectis urbis ac moenibus, a vita fortunisque civium [omnium] arcebis et homines bonorum inimicos, hostis patriae, latrones Italiae scelerum foedere inter se ac nefaria societate coniunctos aeternis suppliciis vivos mortuosque mactabis.


                """, true, true);
        //Thread.sleep(2000);
        //System.err.println("Spanish: Alfonsín, Raúl - "Restauración de la  Democracia" - 10.1983");
        sample.not_spanish not_spanish2 = new not_spanish("""
                "Argentinos: Se acaba... se acaba la dictadura militar. Se acaban la inmoralidad y la prepotencia. Se acaban el miedo y la represión. Se acaba el hambre obrera. Se acaban las fábricas muertas. Se acaba el imperio del dinero sobre el esfuerzo de la producción.
                                
                Se terminó, basta de ser extranjeros en nuestra tierra.
                                
                Argentinos, vamos todos a volver a ser los dueños del país. La Argentina será de su pueblo. Nace la democracia y renacen los argentinos.
                                
                Decidimos el país que queremos; estamos enfrentando el momento más decisivo del último siglo.
                                
                Y ya no va a haber ningún iluminado que venga a explicarnos cómo se construye la república. Ya no habrá más sectas de “nenes de papá”, ni de adivinos, ni de uniformados, ni de matones para decirnos lo que tenemos que hacer con la patria.
                                
                Ahora somos nosotros, el conjunto del pueblo, quienes vamos a decir cómo se construye el país. Y que nadie se equivoque, que la lucha electoral no confunda a nadie; no hay dos pueblos. Hay dos dirigencias, dos posibilidades. Pero hay un solo pueblo.
                                
                Así, lo que vamos a decidir dentro de cuatro días es cuál de los dos proyectos populares de la Argentina va a tener la responsabilidad de conducir al país. Y aquí tampoco nadie debe confundirse.
                                
                No son los objetivos nacionales los que nos diferencian sino los métodos y los hombres, para alcanzarlos.
                                
                No es suficiente levantar la bandera de justicia social, hay que construirla y hacer que permanezca. Las conquistas pasajeras, frágiles, las borran de un plumazo las dictaduras. Y entonces, es el pueblo el que paga los errores de los gobiernos populares.
                                
                No puede haber más equivocaciones. Hay que saber gobernar a la Argentina. Éste no es un tiempo para improvisar, para debilitarse en luchas internas. Hay demasiado trabajo que hacer para que se carezca de la unidad de mano necesaria para enfrentar todos los problemas que nos deja la dictadura.
                No alcanza declamar la libertad. Hay que tener historia de libertad para poder asegurarla. Si no, vuelve el silencio, la represión y el miedo.
                                
                Lo que vamos a decidir es cuál de los dos proyectos populares está en mejores condiciones de lograr la libertad y la justicia social sin retrocesos, para éstas y las próximas generaciones de argentinos.
                                
                Los más altos dirigentes justicialistas han dicho que las elecciones no las ganará ningún candidato sino que las va a ganar Perón, así como el Cid Campeador venció muerto una batalla.
                                
                Me pregunto, como se preguntan millones de argentinos, entonces, ¿quién va a gobernar en la Argentina? Y me lo pregunto al igual que millones de argentinos, porque todos recordamos muy bien lo que ocurrió cuando murió Perón.
                En ese momento, se produjo una crisis de autoridad que ocasionó grandes daños al país. En esos años, hubo quienes tomaron decisiones desacertadas, hubo quienes actuaron irresponsablemente, hubo quienes precedieron con buena voluntad y hubo quienes lo hicieron de manera criminal. Pero lo cierto es que sucedía algo más importante: nadie sabía realmente quién gobernaba en verdad a la Argentina. La crisis de autoridad creada por la muerte de Perón, al no poder ser resuelta por el partido gobernante, colocó a la Nación más allá de la voluntad, e incluso de la buena voluntad, de los que deseaban fervientemente consolidar un gobierno popular al servicio del pueblo.
                                
                Asistimos entonces a un caos económico, al desorden social y a la escalada de la violencia. El llamado Rodrigazo inauguró hiperinflación y la especulación más desenfrenada. Esta inflación galopante, desatada en junio de 1975, implicó un despojo cotidiano sobre todos los salarios. La reacción justa e inevitable de los trabajadores ahondó un creciente desorden social.
                                
                Entretanto, la acción de las Tres A, desplegada con toda intensidad e impunidad, había suscitado un clima de violencia generalizada. Sobre este telón de fondo, en medio del caos económico y el desorden social, nos vimos envueltos en un juego enloquecido de terrorismo y represión que se fue ampliando de manera incontenible.
                                
                Nadie podrá reprochar jamás al radicalismo haber echado leña al fuego en esos años de desorientación y crisis. El radicalismo no intentó aprovecharlos en su favor sino que puso todo su esfuerzo para que se mantuvieran las instituciones de la república.
                                
                Pero la crisis de autoridad suscitada por la muerte de Perón resultó inmanejable y tuvo consecuencias trágicas. La más evidente, que todos sufrimos, fue la de ofrecer el pretexto esperado por las minorías del privilegio para provocar el golpe de 1976 y sumir a la Nación argentina en el régimen más oprobioso de toda su historia.
                                
                Vinieron con el pretexto de terminar con la especulación y desencadenaron una especulación gigantesca que desmanteló el aparato productivo del país, empobreció a la inmensa mayoría de los argentinos y enriqueció desmesuradamente a un minúsculo grupo de parásitos.
                                
                Vinieron con el pretexto de evitar la cesación de pagos ante el extranjero y endeudaron al país en una forma que nadie hubiera podido imaginar y sin dejar nada a cambio de una deuda inmensa.
                                
                Vinieron con el pretexto de eliminar la corrupción y terminaron corrompiendo todo, hasta las palabras más sagradas y los juramentos más solemnes.
                                
                Vinieron con el pretexto de restaurar la tranquilidad y se ocuparon de imponer el temor a la inmensa mayoría de los argentinos.
                                
                Vinieron con el pretexto de instaurar el orden y acabar con la violencia y desataron una represión masiva, atroz e ilegal, acarreando un drama tremendo para el país, cavando un foso de sangre deliberadamente, impulsado por algunos grupos privilegiados con el designio de enfrentar definitivamente a las Fuerzas Armadas con el pueblo argentino a fin de entorpecer o impedir la vialidad de cualquier futuro gobierno popular.
                                
                Vinieron con el pretexto de imponer la paz e incitaron a la guerra, hasta que, usando las aspiraciones más legítimas y sentidas por todos los argentinos, se embarcaron irresponsablemente en el conflicto de las Malvinas.
                                
                Nadie puede imaginar que sea responsable de estas tragedias la masa de hombres y mujeres argentinos que creían en Perón. Por el contrario, ellos, como la inmensa mayoría de los argentinos, han sido las víctimas de tales males.
                                
                                
                                
                Pero sería irresponsable no reconocer que la crisis de autoridad que siguió a la muerte de Perón desembocó en una situación inmanejable para el partido entonces gobernante. Así cundieron el desconcierto y el descreimiento y se dejó el campo libre para la aventura del régimen militar y los intereses espurios, de adentro y de afuera, que se encaramaron en el poder.
                                
                Es una lección amarga que los argentinos no podemos ni debemos olvidar porque, si no, las desgracias volverán a repetirse. Detrás de esa lección hay otra más profunda que tampoco deberemos olvidar. La crisis de autoridad que se vivió al morir Perón abrió una disputa por el poder en la que predominaron la prepotencia y la violencia. Pero con la prepotencia y la violencia no hay gobierno posible para el pueblo argentino: con ellas sólo se benefician los pequeños grupos que las manejan mientras casi todos los argentinos se perjudican. Peor aún: por ese camino corremos el peligro de quedarnos sin país.
                Porque la violencia y la prepotencia son las que nos impiden construir. Es la violencia alternativamente ejercida por unos y otros grupos minoritarios, ya sea la violencia física, económica, social o política, la que nos obliga a comenzar siempre de nuevo, la que viene a destruir lo que a duras penas levantamos un día y nos fuerza a empezarlo otra vez al día siguiente. ¿Qué industria vamos a tener si cada dos o tres o cuatro años las fábricas se cierran y pasan otros tantos años para abrirlas otra vez y recomenzar casi de cero? ¿Qué sindicatos vamos a tener si los trabajadores se ven entorpecidos desde afuera o desde adentro para construirlos y perfeccionarlos a través del tiempo por su libre decisión, ejerciendo con pasión pero con tranquilidad la crítica que permite corregir errores y mejorar las cosas? ¿Qué educación vamos a tener si la intolerancia y la prepotencia llevan periódicamente a echar maestros y profesores, a cerrar aulas y laboratorios, a destruir una y otra vez en pocos días lo que tanto trabajo y tantos años cuesta levantar en cada ocasión? Y así podríamos seguir con cada tema, con cada actividad. ¿Cómo nos vamos a quedar inermes ante los intereses extranjeros si destruyéndonos una y otra vez a nosotros mismos somos incapaces de fortalecernos?
                                
                Los argentinos, casi todos los argentinos, tenemos en nuestra boca el amargo regusto de trabajar en vano, de arar en el mar porque periódicamente asistimos a la destrucción de nuestros esfuerzos.
                                
                Y todo esto ocurre porque el poder que se puede obtener con la violencia y la prepotencia sólo sirve para lo que ellas sirvan, es decir para destruir. Es poco o nada lo que se puede construir con la violencia y la prepotencia. Y así es como está nuestra desgraciada Nación.
                                
                La crisis de autoridad sólo será resuelta restableciendo la autoridad, es decir la capacidad para conciliar, la aptitud para convencer y no para vencer.
                                
                Tendremos autoridad porque seremos capaces de convencer, porque estamos proponiendo lo que todos los argentinos sabemos que necesitamos: la paz y la tranquilidad de una convivencia en la que se respeten las discrepancias y en la que los esfuerzos para construir que hagamos cada día no sean destruidos mañana por la intolerancia y la violencia.
                                
                Proponerse convencer sólo tiene sentido si estamos dispuestos también a que otros nos puedan convencer a nosotros, si aseguramos la libertad y la tolerancia entre los argentinos. Proclamamos estas ideas no sólo porque nos parecen mejores, sino –y sobre todo– porque sabemos que constituyen el único método para que los argentinos nos pongamos a construir de una vez por todas nuestro futuro. Esto es, simplemente, la democracia.
                                
                Y cuando denunciemos a quienes proponen, de uno u otro modo, perpetuar la violencia, la prepotencia o la intolerancia como método de gobierno, no queremos ni nos importa denunciar a una o varias personas determinadas. Lo que nos preocupa, y lo que nunca dejará de preocuparnos, es impedir que ese método destructivo siga imperando en nuestra patria, que siga aniquilando los esfuerzos de todos los argentinos, que siga condenándonos, como nos condenó hasta ahora, a ser un país en guerra consigo mismo.
                                
                Hay quienes creen, por tener demasiado metida dentro de sí mismos la prepotencia, o por soñar con soluciones mágicas e inmediatas, que ser tolerantes es ser débiles. Se confunden por completo. Para ser tolerantes y para hacer imperar la tolerancia se requiere mucho más firmeza que para ser prepotentes.
                                
                En primer lugar, se necesita firmeza consigo mismo para no caer en la tentación de abusar del propio poder. ¡Cuánto mejor estaríamos hoy sí en las Fuerzas Armadas hubiera existido el buen criterio, el correcto criterio de usar las armas que el pueblo les entregó para defenderlo eficientemente contra las Fuerzas Armadas de otros países y no para ocupar el gobierno de la república!
                                
                ¿Cuánto mejor estaríamos si casi todos los gobiernos no hubieran cedido a la tensión de declarar el estado de sitio –medida excepcional y extrema según la Constitución– para vencer sus dificultades en vez de procurar convencer a la población, aceptar sus críticas y garantizar el reemplazo pacífico de los gobernantes.
                                
                Pero también se requiere mucha firmeza para impedir, de una vez por todas, que vuelvan a triunfar los profetas de la prepotencia y de la violencia. Después de las desgracias que sufrimos, el pueblo argentino entero habrá de impedirlo. Nunca más permitiremos que un pequeño grupo de iluminados, con o sin uniforme, pretenda erigirse en salvadores de la patria, mandándonos y pretendiendo que obedezcamos sin chistar. Porque sabemos que sólo podremos levantarnos de estas ruinas que nos oprimen mediante el esfuerzo libre y voluntario de todos, mediante el trabajo oscuro y cotidiano de cada uno. Ningún obstáculo será insuperable frente a la voluntad inmensa de un pueblo que se pone a trabajar si cerramos definitivamente el camino a la prepotencia y la violencia y la destrucción con las que nos amenazan.
                                
                                
                                
                Estas ideas constituyen nuestra primera propuesta básica: que sea claro el método con el que vamos a construir nuestro propio futuro, el método de la libertad y de la democracia.
                                
                Nuestra segunda propuesta fundamental, además del método con el que actuaremos, señala el punto de partida del camino que nos propondremos recorrer: el de la justicia social.
                                
                Es innecesario reiterar la gravedad de la situación actual del país, la peor de toda su historia. Pero sí es un deber de todos entender que hay quienes sufren más que otros. Nuestro punto de partida, que sabemos compartido por la inmensa mayoría de los argentinos, apela a un formidable esfuerzo de solidaridad y fraternidad con los que están más desamparados, con los que más necesitan entre todos los que necesitan. Vamos a construir el futuro de la Argentina y comenzaremos por construirlo ya mismo para quienes menos tienen.
                                
                Es por eso que yo hice un solo juramento: no habrá más niños con hambre entre los niños de la Argentina. Esos niños que sufren hambre son los más desamparados entre los desamparados y su condición nos marca con un estigma que debe avergonzarnos como hombres y como argentinos.
                                
                Nuestra apelación a la fraternidad y la solidaridad entre los argentinos es mucho más que un impulso ético. Hay en ella un propósito político en el sentido más profundo de la palabra.
                                
                Porque la riqueza de un país no está en su territorio ni en sus bienes, ni en sus vacas ni en su petróleo: está en todos y cada uno de sus habitantes, en todos y cada uno de sus hombres y mujeres. Es el trabajo, la capacidad de creación de los seres humanos que lo habitan, lo que da sentido y riqueza a un país.
                                
                Por eso, cuando nos proponemos privilegiar el mejoramiento de las condiciones de vida de los sectores más postergados, estamos proponiendo rescatar, lo más rápidamente posible, la mayor fuente de nuestra riqueza, el mayor capital de nuestra patria: es la voluntad de terminar con la inacción a que fueron condenados millones de hombres y mujeres para que sumen su esfuerzo a los otros millones de hombres y mujeres que están trabajando. Es la voluntad de conseguir cuanto antes una mayor igualdad, para que todos los argentinos puedan tener iguales oportunidades de desplegar su esfuerzo creador y contribuir con él al bienestar de todos. Es voluntad de terminar con los que están injustamente relegados porque la sociedad no les ofrece ni les permite lo que debe ofrecerles y permitirles en la Argentina justa y generosa que vamos a construir. Es la voluntad de acabar con la falta de techo y comida, de educación y de salud, que castiga a tantos compatriotas y que nos priva a todos de la contribución que podrían dar a la nación. Es la voluntad de terminar con la discriminación ejercida contra nuestras mujeres argentinas por la subsistencia de costumbres retrógradas.
                                
                Ese pueblo unido en el trabajo, en la libertad y en la justicia social que vamos a tener constituirá la valla más formidable que los argentinos levantaremos para impedir nuevas frustraciones.
                                
                Sobre esa voluntad nuestro gobierno actuará con toda la energía y la firmeza que el pueblo está esperando para que nunca más los pequeños grupos de privilegiados de adentro ni los grandes intereses de afuera quiebren las instituciones y sometan a la Nación.
                                
                Y ahí no habrá ninguna antinomia, porque es falso que las haya, como son falsas las acusaciones que imprudentemente algunos lanzaron.
                                
                No habrá radicales ni antirradicales, ni peronistas ni antiperonistas cuando se trate de terminar con los manejos de la patria financiera, con la especulación de un grupo parasitario enriquecido a costa de la miseria de los que producen y trabajan.
                                
                No habrá radicales ni antirradicales, ni peronistas ni antiperonistas cuando haya que impedir cualquier loca aventura militar que pretenda dar un nuevo golpe.
                                
                Sabemos que, como argentinos, son innumerables quienes aprendieron que detrás de las palabras grandilocuentes con las que se incita a los golpes está, ahora más que nunca, la avidez de unos pocos privilegiados dispuestos a arruinar al país y grandes intereses extranjeros dispuestos a someterlo.
                                
                La inmensa mayoría de los argentinos, sin distinciones ni banderas, y el gobierno al frente, terminarán para siempre con cualquier tentativa de recrear la perversa e ilícita asociación de miembros de las cúpulas de las FF.AA., formando un partido militar, para aliarse una vez más con la elite parasitaria de la patria financiera a fin de conquistar y usufructuar el poder en su propio beneficio.
                                
                No habrá radicales ni antirradicales, ni peronistas ni antiperonistas sino argentinos unidos para enfrentar el imperialismo en nuestra patria o para apoyar solidariamente a los países hermanos que sufran sus ataques.
                                
                La construcción y la defensa de la Argentina la haremos marchando juntos, aceptando en libertad las discrepancias, respetando las diferencias de opinión, admitiendo sin reparos las controversias en el marco de nuestras instituciones, porque así y sólo así podremos lograr la unión que necesitamos para salir adelante.
                                
                                
                                
                Una nación es una voluntad viviente y, al igual que los hombres, se templa con las desgracias. Las desgracias que sufrimos nos han templado y ese temple es indispensable para sobrellevar las dificultades que deberemos superar.
                                
                ¡Y las vamos a superar!
                                
                Tenemos el inmenso privilegio, entre los países del mundo, de disponer de un territorio extenso y lleno de posibilidades que esperan ser explotadas. Frente a un pueblo que despliegue con vigor su capacidad de trabajo y vaya construyendo piedra sobre piedra su futuro, impidiendo que nadie, nunca más, venga a destruir lo que vaya haciendo, no hay dificultad que no pueda superarse. Éste es nuestro propósito, ésa es la voluntad en que nos empeñaremos todos los argentinos, ése será nuestro gobierno.
                                
                Y el símbolo que coronará nuestros esfuerzos, que expresará mejor que ningún otro la autoridad, la paz, la tolerancia, la continuidad del trabajo fructífero de la Nación, lo veremos dentro de seis años, cuando entreguemos las instituciones intactas, la banda y el bastón de Presidente a quien el pueblo argentino haya elegido libre y voluntariamente. "
                """, true, true);
        //Thread.sleep(2000);
        //System.err.println("Spanish: Allende, Salvador - "Manifiesto al País" - 08.1973");
        sample.not_spanish not_spanish3 = new not_spanish("""
                "Al país:
                La Cámara de Diputados ha aprobado, con los votos de la oposición, un acuerdo político destinado a desprestigiar al país en el extranjero y crear confusión interna. Facilitará con ello la intención sediciosa de determinados sectores.
                Para que el Congreso se pronuncie sobre el comportamiento legal del Gobierno, existe un solo camino: La acusación constitucional según el procedimiento expresamente contemplado por la Constitución. En las elecciones parlamentarias últimas sectores opositores trataron de obtener dos tercios de los senadores para poder acusar al Presidente. No lograron suficiente respaldo electoral para ello. Por eso, ahora, pretenden, mediante un simple acuerdo, producir los mismos efectos de la acusación constitucional. El inédito acuerdo aprobado no tiene validez jurídica alguna para el fin perseguido, ni vincula a nadie. Pero contiene el símbolo de la renuncia por parte de algunos sectores a los valores cívicos más esenciales de nuestra democracia.
                En el día de anteayer, los diputados de oposición han exhortado formalmente a las Fuerzas Armadas y Carabineros a que adopten una posición deliberante frente al Poder Ejecutivo, a que quebranten su deber de obediencia al Supremo Gobierno, a que se indisciplinen contra la autoridad civil del Estado a la que están subordinadas por mandato de la Carta Fundamental, a que asuman una función política según las opiniones institucionales de la mayoría de una de las ramas del Congreso.
                Que un órgano del Poder Legislativo invoque la intervención de las Fuerzas Armadas y de Orden frente al Gobierno democráticamente elegido, significa subordinar la representación política de la Soberanía Nacional a Instituciones Armadas.
                                
                El Presidente de la República, en uso de sus atribuciones privativas, ha confiado responsabilidades ministeriales a las Fuerzas Armadas y Carabineros para cumplir en el Gabinete un deber superior al servicio de la paz cívica y de la Seguridad Nacional, defendiendo las instituciones republicanas frente a la insurrección y terrorismo. Pedir a las Fuerzas Armadas y Carabineros que lleven a cabo funciones de gobierno al margen de la autoridad y dirección política del Presidente de la República es promover al golpe de Estado. Con ello, la oposición que dirige la Cámara de Diputados asume la responsabilidad histórica de incitar a la destrucción de las instituciones democráticas, y respalda de hecho a quienes conscientemente vienen buscando la guerra civil.
                                
                La democracia chilena es una conquista de todo el pueblo. No es obra ni regalo de las clases exploradoras y será defendida por quienes, con sacrificios acumulados de generaciones, la han impuesto.
                Con tranquilidad de conciencia y midiendo mi responsabilidad ante las generaciones presentes y futuras, sostengo que nunca antes ha habido en Chile un Gobierno más democrático que el que me honro en presidir, que haya hecho más por defender la independencia económica y política del país, por la liberación social de los trabajadores. El Gobierno ha sido respetuoso de las leyes y se ha desempeñado en realizar transformaciones en nuestras estructuras económicas y sociales.
                Reitero solemnemente mi decisión de desarrollar la democracia y el Estado de Derecho hasta sus últimas consecuencias. Y como dijera el pasado día 2 en carta al presidente del Partido Demócrata Cristiano, “es en la robustez de las instituciones políticas donde reposa la fortaleza de nuestro régimen institucional”.
                                
                El parlamento se ha constituído en un bastión contra las transformaciones y ha hecho todo lo que ha estado en su mano para perturbar el funcionamiento de las finanzas y de las instituciones, esterilizando cualquier iniciativa creadora. Anteayer la mayoría de la Cámara de Diputados, al silenciar toda condena al terrorismo imperante, en el hecho lo ampara y lo acepta.
                Con ello facilitan la sedición de los que quisieran inmolar a los trabajadores que bregan por su libertad, económica y política plenas. Por ello me es posible acusar a la oposición de querer impedir el desarrollo histórico de nuestra legalidad democrática, elevándola a un nivel más auténtico y alto. Pretenden ignorar que el Estado de Derecho sólo se realiza plenamente en la medida que se superen las desigualdades de una sociedad capitalista.
                Con estas acciones la reacción chilena descubre ante el país entero y el mundo los intereses egoístas que defiende.
                                
                Hoy cuando la reacción embiste de frente contra la razón del derecho y amenaza de muerte a las libertades, cuando los trabajadores reivindican con fuerza una nueva sociedad, los chilenos pueden estar seguros de que el Presidente de la República, junto al pueblo, cumplirá sin vacilaciones con su deber, para asegurar así la plena realidad de la democracia y las libertades dentro del proceso revolucionario. Para esta noble tarea convoco a los trabajadores, a todos los demócratas y patriotas de Chile."
                """, true, true);
        //Thread.sleep(2000);
        //System.err.println("French - Patrick Modiano, Rue de Boutiques Obscures");
        sample.not_spanish not_spanish4 = new not_spanish("""
                Je ne suis rien. Rien qu'une silhouette claire, ce soir-là, à la terrasse d'un café. J'attendais que la pluie s'arrêtât, une averse qui avait commencé de tomber au moment où Hutte me quittait.
                                
                Quelques heures auparavant, nous nous étions retrouvés pour la dernière fois dans les locaux de l'Agence. Hutte se tenait derrière le bureau massif, comme d'habitude, mais gardait son manteau, de sorte qu'on avait vraiment l'impression d'un départ. J'étais assis en face de lui, sur le fauteuil en cuir réservé aux clients. La lampe d'opaline répandait une lumière vive qui m'éblouissait.
                                
                - Eh bien voilà, Guy... C'est fini..., a dit Hutte dans un soupir.
                                
                Un dossier traînait sur le bureau. Peut-être celui du petit homme brun au regard effaré et au visage bouffi, qui nous avait chargés de suivre sa femme. L'après-midi, elle allait rejoindre un autre petit homme brun au visage bouffi, dans un hôtel meublé de la rue Vital, voisine de l'avenue Paul-Doumer. [11]
                                
                Hutte se caressait pensivement la barbe, une barbe poivre et sel, courte, mais qui lui mangeait les joues. Ses gros yeux clairs étaient perdus dans le vague. A gauche du bureau, la chaise d'osier où je m'asseyais aux heures de travail. Derrière Hutte, des rayonnages de bois sombre couvraient la moitié du mur : y étaient rangés des Bottins et des annuaires de toutes espèces et de ces cinquante dernières années. Hutte m'avait souvent dit qu'ils étaient des outils de travail irremplaçables dont il ne se séparerait jamais. Et que ces Bottins et ces annuaires constituaient la plus précieuse et la plus émouvante bibliothèque qu'on pût avoir, car sur leurs pages étaient répertoriés bien des êtres, des choses, des mondes disparus, et dont eux seuls portaient témoignage.
                                
                - Qu'est-ce que vous allez faire de tous ces Bottins ? ai-je demandé à Hutte, en désignant d'un mouvement large du bras les rayonnages.
                                
                - Je les laisse ici, Guy. Je garde le bail de l'appartement.
                                
                Il jeta un regard rapide autour de lui. Les deux battants de la porte qui donnait accès à la petite pièce voisine étaient ouverts et l'on distinguait le canapé au velours usé, la cheminée, et la glace où se réfléchissaient les rangées d'annuaires et de Bottins et le visage de Hutte. Souvent nos clients attendaient dans cette pièce. Un tapis persan protégeait le parquet. Au mur, près de la fenêtre, était accrochée une icône.
                                
                - A quoi pensez-vous, Guy ? [12]
                                
                - A rien. Alors, vous gardez le bail ?
                                
                - Oui. Je reviendrai de temps en temps à Paris et l'Agence sera mon pied-à-terre.
                                
                Il m'a tendu son étui à cigarettes.
                                
                - Je trouve ça moins triste de conserver l'Agence telle qu'elle était.
                                
                Cela faisait plus de huit ans que nous travaillions ensemble. Lui-même avait créé cette agence de police privée en 1947 et travaillé avec bien d'autres personnes, avant moi. Notre rôle était de fournir aux clients ce que Hutte appelait des « renseignements mondains ». Tout se passait, comme il le répétait volontiers, entre « gens du monde ».
                                
                - Vous croyez que vous pourrez vivre à Nice ?
                                
                - Mais oui.
                                
                - Vous n'allez pas vous ennuyer ?
                                
                Il a soufflé la fumée de sa cigarette.
                                
                - Il faut bien prendre sa retraite un jour, Guy.
                                
                Il s'est levé lourdement. Hutte doit peser plus de cent kilos et mesurer un mètre quatre-vingt-quinze.
                                
                - Mon train est à 20 h 55. Nous avons le temps de prendre un verre.
                                
                Il m'a précédé dans le couloir qui mène au vestibule. Celui-ci a une curieuse forme ovale et des murs d'un beige déteint. Une serviette noire, si pleine qu'on n'avait pas pu la fermer, était posée par terre. Hutte la prit. Il la portait en la soutenant de la main.
                                
                - Vous n'avez pas de bagages ?
                                
                - J'ai fait tout envoyer d'avance.
                                
                Hutte a ouvert la porte d'entrée et j'ai éteint la [13] lumière du vestibule. Sur le palier. Hutte a hésité un instant avant de refermer la porte et ce claquement métallique m'a pincé le cœur. Il marquait la fin d'une longue période de ma vie.
                                
                - Ça fout le cafard, hein, Guy? m'a dit Hutte, et il avait sorti de la poche de son manteau un grand mouchoir dont il s'épongeait le front.
                                
                Sur la porte, il y avait toujours la plaque rectangulaire de marbre noir où était inscrit en lettres dorées et pailletées :
                                
                \s
                                
                C M HUTTE
                                
                Enquêtes privées.
                                
                \s
                                
                - Je la laisse, m'a dit Hutte.
                                
                Puis il a donné un tour de clé.
                                
                Nous avons suivi l'avenue Niel jusqu'à la place Pereire. Il faisait nuit et bien que nous entrions dans l'hiver, l'air était tiède. Place Pereire, nous nous sommes assis à la terrasse des Hortensias. Hutte aimait ce café, parce que les chaises y étaient cannées, « comme avant ».
                                
                - Et vous, Guy, qu'est-ce que vous allez devenir ? m'a-t-il demandé après avoir bu une gorgée de fine à l'eau.
                                
                - Moi ? Je suis sur une piste.
                                
                - Une piste ?
                                
                - Oui. Une piste de mon passé...
                                
                J'avais dit cette phrase d'un ton pompeux qui l'a fait sourire. [14]
                                
                - J'ai toujours cru qu'un jour vous retrouveriez votre passé.
                                
                Cette fois-ci, il était grave et cela m'a ému.
                                
                - Mais voyez-vous, Guy, je me demande si cela en vaut vraiment la peine...
                                
                Il a gardé le silence. A quoi rêvait-il ? A son passé à lui?
                                
                - Je vous donne une clé de l'Agence. Vous pouvez y aller de temps en temps. Ça me ferait plaisir.
                                
                Il m'a tendu une clé que j'ai glissée dans la poche de mon pantalon.
                                
                - Et téléphonez-moi à Nice. Mettez-moi au courant... au sujet de votre passé...
                                
                Il s'est levé et m'a serré la main.
                                
                - Voulez-vous que je vous accompagne au train?
                                
                - Oh non... non... C'est tellement triste...
                                
                Il est sorti du café d'une seule enjambée, en évitant de se retourner, et j'ai éprouvé une sensation de vide. Cet homme avait beaucoup compté pour moi. Sans lui, sans son aide, je me demande ce que je serais devenu, voilà dix ans, quand j'avais brusquement été frappé d'amnésie et que je tâtonnais dans le brouillard. Il avait été ému par mon cas et grâce à ses nombreuses relations, m'avait même procuré un état civil.
                                
                - Tenez, m'avait-il dit en ouvrant une grande enveloppe qui contenait une carte d'identité et un passeport. Vous vous appelez maintenant « Guy Roland ». [15]
                                
                Et ce détective que j'étais venu consulter pour qu'il mît son habileté à rechercher des témoins ou des traces de mon passé avait ajouté :
                                
                - Mon cher « Guy Roland », à partir de maintenant, ne regardez plus en arrière et pensez au présent et à l'avenir. Je vous propose de travailler avec moi...
                                
                S'il me prenait en sympathie, c'est que lui aussi - je l'appris plus tard - avait perdu ses propres traces et que toute une partie de sa vie avait sombré d'un seul coup, sans qu'il subsistât le moindre fil conducteur, la moindre attache qui aurait pu encore le relier au passé. Car qu'y a-t-il de commun entre ce vieil homme fourbu que je vois s'éloigner dans la nuit avec son manteau râpé et sa grosse serviette noire, et le joueur de tennis d'autrefois, le bel et blond baron balte Constantin von Hutte ?
                                
                \s
                                
                II
                \s
                                
                - Allô ? Monsieur Paul Sonachitzé ?
                                
                - Lui-même.
                                
                - Guy Roland à l'appareil... Vous savez, le...
                                
                - Mais oui, je sais ! Nous pouvons nous voir ?
                                
                - Comme vous voulez...
                                
                - Par exemple... ce soir vers neuf heures rue
                                
                Anatole-de-la-Forge?... Ça vous va?
                                
                - Entendu.
                                
                - Je vous attends. A tout à l'heure.
                                
                Il a raccroché brusquement et la sueur coulait le long de mes tempes. J'avais bu un verre de cognac afin de me donner du courage. Pourquoi une chose aussi anodine que de composer sur un cadran un numéro de téléphone me cause, à moi, tant de peine et d'appréhension ?
                                
                Au bar de la rue Anatole-de-la-Forge, il n'y avait aucun client, et il se tenait derrière le comptoir en costume de ville.
                                
                - Vous tombez bien, m'a-t-il dit. J'ai congé tous les mercredis soir. [17]
                                
                Il est venu vers moi et m'a pris par l'épaule.
                                
                - J'ai beaucoup pensé à vous.
                                
                - Merci.
                                
                - Ça me préoccupe vraiment, vous savez...
                                
                J'aurais voulu lui dire qu'il ne se fît pas de soucis à mon sujet, mais les mots ne venaient pas.
                                
                - Je crois finalement que vous deviez être dans l'entourage de quelqu'un que je voyais souvent à une certaine époque... Mais qui?
                                
                Il hochait la tête.
                                
                - Vous ne pouvez pas me mettre sur la piste ?
                                
                - Non.
                                
                - Pourquoi?
                                
                - Je n'ai aucune mémoire, monsieur.
                                
                Il a cru que je plaisantais, et comme s'il s'agissait d'un jeu ou d'une devinette, il a dit :
                                
                - Bon. Je me débrouillerai tout seul. Vous me laissez carte blanche ?
                                
                - Si vous voulez.
                                
                - Alors ce soir, je vous emmène dîner chez un ami.
                                
                Avant de sortir, il a baissé, d'un mouvement sec, la manette d'un compteur électrique et fermé la porte de bois massif en donnant plusieurs tours de clé.
                                
                Sa voiture stationnait sur le trottoir opposé. Elle était noire et neuve. Il m'a ouvert la portière poliment.
                                
                - Cet ami s'occupe d'un restaurant très agréable à la limite de Ville-d'Avray et de Saint-Cloud.
                                
                - Et nous allons jusque là-bas ? [18]
                                
                - Oui.
                                
                De la rue Anatole-de-la-Forge, nous débouchions dans l'avenue de la Grande-Armée et j'ai eu la tentation de quitter brusquement la voiture. Aller jusqu'à Ville-d'Avray me semblait insurmontable. Mais il fallait être courageux.
                                
                Jusqu'à ce que nous soyons parvenus à la porte de Saint-Cloud, j'ai dû combattre la peur panique qui m'empoignait. Je connaissais à peine ce Sonachitzé. Ne m'attirait-il pas dans un traquenard ? Mais, peu à peu, en l'écoutant parler, je me suis apaisé. Il me citait les différentes étapes de sa vie professionnelle. Il avait d'abord travaillé dans des boîtes de nuit russes, puis au Langer, un restaurant des jardins des Champs-Elysées, puis à l'hôtel Castille, rue Cambon, et il était passé par d'autres établissements, avant de s'occuper de ce bar de la rue Anatole-de-la-Forge. Chaque fois, il retrouvait Jean Heurteur, l'ami chez lequel nous allions, de sorte qu'ils avaient formé un tandem pendant une vingtaine d'années. Heurteur aussi avait de la mémoire. A eux deux, ils résoudraient certainement « l'énigme » que je posais.
                                
                Sonachitzé conduisait avec une grande prudence et nous avons mis près de trois quarts d'heure pour arriver à destination.
                                
                Une sorte de bungalow dont un saule pleureur cachait la partie gauche. Vers la droite, je discernais un fouillis de buissons. La salle du restaurant était vaste. Du fond, où brillait une lumière vive, un homme marchait vers nous. Il me tendit la main. [19]
                                
                - Enchanté, monsieur. Jean Heurteur.
                                
                Puis, à l'adresse de Sonachitzé :
                                
                - Salut, Paul.
                                
                Il nous entraînait vers le fond de la salle. Une table de trois couverts était dressée, au centre de laquelle il y avait un bouquet de fleurs.
                                
                Il désigna l'une des portes-fenêtres :
                                
                - J'ai des clients dans l'autre bungalow. Une noce.
                                
                - Vous n'êtes jamais venu ici? me demanda Sonachitzé.
                                
                - Non.
                                
                - Alors, Jean, montre-lui la vue.
                                
                Heurteur me précéda sur une véranda qui dominait un étang. A gauche, un petit pont bombé, de style chinois, menait à un autre bungalow, de l'autre côté de l'étang. Les portes-fenêtres étaient violemment éclairées et derrière elles je voyais passer des couples. On dansait. Les bribes d'une musique nous parvenaient de là-bas.
                                
                - Ils ne sont pas nombreux, me dit-il, et j'ai l'impression que cette noce va finir en partouze.
                                
                Il haussa les épaules.
                                
                - Il faudrait que vous veniez en été. On dîne sur la véranda. C'est agréable.
                                
                Nous rentrâmes dans la salle du restaurant et Heurteur ferma la porte-fenêtre.
                                
                - Je vous ai préparé un dîner sans prétention.
                                
                Il nous fit signe de nous asseoir. Ils étaient côte à côte, en face de moi. [20]
                                
                - Qu'est-ce que vous aimez, comme vins ? me demanda Heurteur.
                                
                - Comme vous voulez.
                                
                - Château-petrus ?
                                
                - C'est une excellente idée, Jean, dit Sonachitzé.
                                
                Un jeune homme en veste blanche nous servait. La lumière de l'applique du mur tombait droit sur moi et m'éblouissait. Les autres étaient dans l'ombre, mais sans doute m'avaient-ils placé là pour mieux me reconnaître.
                                
                - Alors, Jean ?
                                
                Heurteur avait entamé sa galantine et me jetait, de temps en temps, un regard aigu. Il était brun, comme Sonachitzé, et comme lui se teignait les cheveux. Une peau grumeleuse, des joues flasques et de minces lèvres de gastronome.
                                
                - Oui, oui..., a-t-il murmuré.
                                
                Je clignais les yeux, à cause de la lumière. Il nous a versé du vin.
                                
                - Oui... oui... je crois que j'ai déjà vu mon-sieur...
                                
                - C'est un véritable casse-tête, a dit Sonachitzé. Monsieur refuse de nous mettre sur la voie...
                                
                Il semblait saisi d'une inspiration.
                                
                - Mais peut-être voulez-vous que nous n'en parlions plus ? Vous préférez rester « incognito » ?
                                
                - Pas du tout, ai-je dit avec le sourire.
                                
                Le jeune homme servait un ris de veau.
                                
                - Quelle est votre profession? m'a demandé Heurteur.[21]
                                
                - J'ai travaillé pendant huit ans dans une agence de police privée, l'agence C. M. Hutte.
                                
                Ils me considéraient, stupéfaits.
                                
                - Mais cela n'a certainement aucun rapport avec ma vie antérieure. Alors, n'en tenez pas compte.
                                
                - C'est curieux, a déclaré Heurteur en me fixant, on ne pourrait pas dire l'âge que vous avez.
                                
                - A cause de ma moustache, sans doute.
                                
                - Sans votre moustache, a dit Sonachitzé, nous vous reconnaîtrions peut-être tout de suite.
                                
                Et il tendait le bras, posait sa main à plat juste audessous de mon nez pour cacher la moustache, et cillait des yeux comme le portraitiste devant son modèle.
                                
                - Plus je regarde monsieur, plus j'ai l'impression qu'il appartenait à un groupe de noctambules..., a dit Heurteur.
                                
                - Mais quand ? a demandé Sonachitzé.
                                
                - Oh... il y a longtemps... Cela fait une éternité que nous ne travaillons plus dans les boîtes de nuit, Paul...
                                
                - Tu crois que ça remonterait au temps du Tanagi a ?
                                
                Heurteur me fixait d'un regard de plus en plus intense.
                                
                - Excusez-moi, me dit-il. Pourriez-vous vous lever une seconde ?
                                
                Je m'exécutai. Il me regardait de haut en bas et de bas en haut. [22]
                                
                - Mais oui, ça me rappelle un client. Votre taille... Attendez...
                                
                Il avait levé la main et se figeait comme s'il voulait retenir quelque chose qui risquait de se dissiper d'un instant à l'autre.
                                
                - Attendez... Attendez... Ça y est, Paul...
                                
                Il avait un sourire triomphal.
                                
                - Vous pouvez vous rasseoir...
                                
                Il jubilait. Il était sûr que ce qu'il allait dire ferait son effet. Il nous versait du vin, à Sonachitzé et à moi, d'une manière cérémonieuse.
                                
                - Voilà... Vous étiez toujours accompagné d'un homme aussi grand que vous... Peut-être plus grand encore... Ça ne te dit rien, Paul ?
                                
                - Mais de quelle époque parles-tu ? a demandé
                                
                Sonachitzé.
                                
                - De celle du Tanagra, bien sûr...
                                
                - Un homme aussi grand que lui? a répété
                                
                Sonachitzé pour lui-même. Au Tanagra?...
                                
                - Tu ne vois pas ?
                                
                Heurteur haussait les épaules.
                                
                Maintenant c'était au tour de Sonachitzé d'avoir un sourire de triomphe. Il hochait la tête.
                                
                - Je vois...
                                
                - Alors?
                                
                - Stioppa.
                                
                - Mais oui. Stioppa...
                                
                Sonachitzé s'était tourné vers moi.
                                
                - Vous connaissiez Stioppa ?
                                
                - Peut-être, ai-je dit prudemment. [23]
                                
                - Oh... ! Ils ont tous disparu, a dit Sonachitzé d'une voix lugubre. Sauf vous, monsieur... Je suis ravi d'avoir pu vous... vous « localiser »... Vous apparteniez à la bande de Stioppa... Je vous félicite... C'était une époque beaucoup plus belle que la nôtre, et surtout les gens étaient de meilleure qualité qu'aujourd'hui...
                                
                - Et surtout, nous étions plus jeunes, a dit Heurteur en riant.
                                
                - Ça remonte à quand ? leur ai-je demandé, le cœur battant.
                                
                - Nous sommes brouillés avec les dates, a dit Sonachitzé. De toute façon, cela remonte au déluge...
                                
                Il était accablé, brusquement.
                                
                - Il y a parfois des coïncidences, a dit Heurteur.
                                
                Et il se leva, se dirigea vers un petit bar, dans un coin de la pièce, et nous rapporta un journal dont il feuilleta les pages. Enfin, il me tendit le journal en me désignant l'annonce suivante :
                                
                « On nous prie d'annoncer le décès de Marie de Resen, survenu le 25 octobre dans sa quatre-vingt-douzième année.
                                
                « De la part de sa fille, de son fils, de ses petits-fils, neveux et petits-neveux.
                                
                « Et de la part de ses amis Georges Sacher et Stioppa de Djagoriew.
                                
                « La cérémonie religieuse, suivie de l'inhumation au cimetière de Sainte-Geneviève-des-Bois, aura lieu le 4 novembre à 16 heures en la chapelle du cimetière. [26]
                                
                «( L'office du 9e jour sera célébré le 5 novembre en l'église orthodoxe russe, 19, rue Claude-Lorrain, Paris XVIe.
                                
                « Le présent avis tient lieu de f airepart. »
                                
                - Alors, Stioppa est vivant? a dit Sonachitzé. Vous le voyez encore ?
                                
                - Non, ai-je dit.
                                
                - Vous avez raison. Il faut vivre au présent. Jean, tu nous sers un alcool ?
                                
                - Tout de suite.
                                
                A partir de ce moment, ils ont paru se désintéresser tout à fait de Stioppa et de mon passé. Mais cela n'avait aucune importance, puisque je tenais enfin une piste.
                                
                - Vous pouvez me laisser ce journal? ai-je demandé avec une feinte indifférence.
                                
                - Bien sûr, a dit Heurteur.
                                
                Nous avons trinqué. Ainsi, de ce que j'avais été jadis, il ne restait plus qu'une silhouette dans la mémoire de deux barmen, et encore était-elle à moitié cachée par celle d'un certain Stioppa de Djagoriew. Et de ce Stioppa, ils n'avaient pas eu de nouvelles « depuis le déluge », comme disait Sonachitzé.
                                
                - Donc, vous êtes détective privé ? m'a demandé Heurteur.
                                
                - Plus maintenant. Mon patron vient de prendre sa retraite.
                                
                - Et vous ? Vous continuez ?
                                
                J'ai haussé les épaules, sans répondre.[27]
                                
                - En tout cas, je serais ravi de vous revoir. Revenez ici quand vous voudrez.
                                
                Il s'était levé et nous tendait la main.
                                
                - Excusez-moi... Je vous mets à la porte mais j'ai encore de la comptabilité à faire... Et les autres, avec leur partouze...
                                
                Il fit un geste en direction de l'étang.
                                
                - Au revoir, Jean.
                                
                - Au revoir, Paul.
                                
                Heurteur me regardait pensivement. D'une voix très lente :
                                
                - Maintenant que vous êtes debout, vous me rappelez autre chose...
                                
                - Il te rappelle quoi ? demanda Sonachitzé.
                                
                - Un client qui rentrait tous les soirs très tard quand nous travaillions à l'hôtel Castille...
                                
                Sonachitzé à son tour me considérait de la tête aux pieds.
                                
                - C'est possible après tout, me dit-il, que vous soyez un ancien client de l'hôtel Castille...
                                
                J'ai eu un sourire embarrassé.
                                
                Sonachitzé m'a pris le bras et nous avons traversé la salle du restaurant, encore plus obscure qu'à notre arrivée. La mariée en robe bleu pâle ne se trouvait plus à sa table. Dehors, nous avons entendu des bouffées de musique et des rires qui venaient de l'autre côté de l'étang.
                                
                - S'il vous plaît, ai-je demandé à Sonachitzé, pouvez-vous me rappeler quelle était la chanson que réclamait toujours ce... ce...
                                
                - Ce Stioppa ? [28]
                                
                - Oui.
                                
                Il s'est mis à siffler les premières mesures. Puis il s'est arrêté.
                                
                - Vous allez revoir Stioppa ?
                                
                - Peut-être.
                                
                Il m'a serré le bras très fort.
                                
                - Dites-lui que Sonachitzé pense encore souvent à lui.
                                
                Son regard s'attardait sur moi :
                                
                - Au fond, Jean a peut-être raison. Vous étiez un client de l'hôtel Castille... Essayez de vous rappeler... l'hôtel Castille, rue Cambon...
                                
                J'ai détourné la tête et ouvert la portière de la voiture. Quelqu'un était blotti sur le siège avant, le front appuyé contre la vitre. Je me suis penché et j'ai reconnu la mariée. Elle dormait, sa robe bleu pâle relevée jusqu'à micuisses.
                                
                - Il faut la sortir de là, m'a dit Sonachitzé.
                                
                Je l'ai secouée doucement mais elle dormait toujours. Alors, je l'ai prise par la taille et je suis parvenu à la tirer hors de la voiture.
                                
                - On ne peut quand même pas la laisser par terre, ai-je dit.
                                
                Je l'ai portée dans mes bras jusqu'à l'auberge. Sa tête avait basculé sur mon épaule et ses cheveux blonds me caressaient le cou. Elle avait un parfum poivré qui me rappelait quelque chose. Mais quoi ?
                                
                                
                """, true, true);
        //Thread.sleep(2000);
        //System.err.println("Spanish: La Sombra del Viento");
        sample.not_spanish not_spanish5 = new not_spanish("""
                EL CEMENTERIO DE LOS LIBROS OLVIDADOS
                –
                Todavía recuerdo aquel amanecer en que mi padre me llevó por primera vez a visitar el Cementerio de los Libros Olvidados. Desgranaban los primeros días del verano de 1945 y caminábamos por las calles de una Barcelona atrapada bajo cielos de ceniza y un sol de vapor que se derramaba sobre la Rambla de Santa Mónica en una guirnalda de cobre líquido.
                                
                —Daniel, lo que vas a ver hoy no se lo puedes contar a nadie —advirtió mi padre—. Ni a tu amigo Tomás. A nadie.
                                
                —¿Ni siquiera a mamá? —inquirí yo, a media voz.
                                
                Mi padre suspiró, amparado en aquella sonrisa triste que le perseguía como una sombra por la vida.
                                
                —Claro que sí —respondió cabizbajo—. Con ella no tenemos secretos. A ella puedes contárselo todo.
                                
                Poco después de la guerra civil, un brote de cólera se había llevado a mi madre. La enterramos en Montjuïc el día de mi cuarto cumpleaños. Sólo recuerdo que llovió todo el día y toda la noche, y que cuando le pregunté a mi padre si el cielo lloraba le faltó la voz para responderme. Seis años después, la ausencia de mi madre era para mí todavía un espejismo, un silencio a gritos que aún no había aprendido a acallar con palabras. Mi padre y yo vivíamos en un pequeño piso de la calle Santa Ana, junto a la plaza de la iglesia. El piso estaba situado justo encima de la librería especializada en ediciones de coleccionista y libros usados heredada de mi abuelo, un bazar encantado que mi padre confiaba en que algún día pasaría a mis manos. Me crié entre libros, haciendo amigos invisibles en páginas que se deshacían en polvo y cuyo olor aún conservo en las manos. De niño aprendí a conciliar el sueño mientras le explicaba a mi madre en la penumbra de mi habitación las incidencias de la jornada, mis andanzas en el colegio, lo que había aprendido aquel día… No podía oír su voz o sentir su tacto, pero su luz y su calor ardían en cada rincón de aquella casa y yo, con la fe de los que todavía pueden contar sus años con los dedos de las manos, creía que si cerraba los ojos y le hablaba, ella podría oírme desde donde estuviese. A veces, mi padre me escuchaba desde el comedor y lloraba a escondidas.
                                
                Recuerdo que aquel alba de junio me desperté gritando. El corazón me batía en el pecho como si el alma quisiera abrirse camino y echar a correr escaleras abajo. Mi padre acudió azorado a mi habitación y me sostuvo en sus brazos, intentando calmarme.
                                
                —No puedo acordarme de su cara. No puedo acordarme de la cara de mamá —murmuré sin aliento.
                                
                Mi padre me abrazó con fuerza.
                                
                —No te preocupes, Daniel. Yo me acordaré por los dos.
                                
                Nos miramos en la penumbra, buscando palabras que no existían. Aquélla fue la primera vez en que me di cuenta de que mi padre envejecía y de que sus ojos, ojos de niebla y de pérdida, siempre miraban atrás. Se incorporó y descorrió las cortinas para dejar entrar la tibia luz del alba.
                                
                —Anda, Daniel, vístete. Quiero enseñarte algo —dijo.
                                
                —¿Ahora? ¿A las cinco de la mañana?
                                
                —Hay cosas que sólo pueden verse entre tinieblas —insinuó mi padre blandiendo una sonrisa enigmática que probablemente había tomado prestada de algún tomo de Alejandro Dumas.
                                
                Las calles aún languidecían entre neblinas y serenos cuando salimos al portal. Las farolas de las Ramblas dibujaban una avenida de vapor, parpadeando al tiempo que la ciudad se desperezaba y se desprendía de su disfraz de acuarela. Al llegar a la calle Arco del Teatro nos aventuramos camino del Raval bajo la arcada que prometía una bóveda de bruma azul. Seguí a mi padre a través de aquel camino angosto, más cicatriz que calle, hasta que el reluz de la Rambla se perdió a nuestras espaldas. La claridad del amanecer se filtraba desde balcones y cornisas en soplos de luz sesgada que no llegaban a rozar el suelo. Finalmente, mi padre se detuvo frente a un portón de madera labrada ennegrecido por el tiempo y la humedad. Frente a nosotros se alzaba lo que me pareció el cadáver abandonado de un palacio, o un museo de ecos y sombras.
                                
                —Daniel, lo que vas a ver hoy no se lo puedes contar a nadie. Ni a tu amigo Tomás. A nadie.
                                
                Un hombrecillo con rasgos de ave rapaz y cabellera plateada nos abrió la puerta. Su mirada aguileña se posó en mí, impenetrable.
                                
                —Buenos días, Isaac. Éste es mi hijo Daniel —anunció mi padre—. Pronto cumplirá once años, y algún día él se hará cargo de la tienda. Ya tiene edad de conocer este lugar.
                                
                El tal Isaac nos invitó a pasar con un leve asentimiento. Una penumbra azulada lo cubría todo, insinuando apenas trazos de una escalinata de mármol y una galería de frescos poblados con figuras de ángeles y criaturas fabulosas. Seguimos al guardián a través de aquel corredor palaciego y llegamos a una gran sala circular donde una auténtica basílica de tinieblas yacía bajo una cúpula acuchillada por haces de luz que pendían desde lo alto. Un laberinto de corredores y estanterías repletas de libros ascendía desde la base hasta la cúspide, dibujando una colmena tramada de túneles, escalinatas, plataformas y puentes que dejaban adivinar una gigantesca biblioteca de geometría imposible. Miré a mi padre, boquiabierto. Él me sonrió, guiñándome el ojo.
                                
                —Daniel, bien venido al Cementerio de los Libros Olvidados.
                                
                Salpicando los pasillos y plataformas de la biblioteca se perfilaban una docena de figuras. Algunas de ellas se volvieron a saludar desde lejos, y reconocí los rostros de diversos colegas de mi padre en el gremio de libreros de viejo. A mis ojos de diez años, aquellos individuos aparecían como una cofradía secreta de alquimistas conspirando a espaldas del mundo. Mi padre se arrodilló junto a mí y, sosteniéndome la mirada, me habló con esa voz leve de las promesas y las confidencias.
                                
                —Este lugar es un misterio, Daniel, un santuario. Cada libro, cada tomo que ves, tiene alma. El alma de quien lo escribió, y el alma de quienes lo leyeron y vivieron y soñaron con él. Cada vez que un libro cambia de manos, cada vez que alguien desliza la mirada por sus páginas, su espíritu crece y se hace fuerte. Hace ya muchos años, cuando mi padre me trajo por primera vez aquí, este lugar ya era viejo. Quizá tan viejo como la misma ciudad. Nadie sabe a ciencia cierta desde cuándo existe, o quiénes lo crearon. Te diré lo que mi padre me dijo a mí. Cuando una biblioteca desaparece, cuando una librería cierra sus puertas, cuando un libro se pierde en el olvido, los que conocemos este lugar, los guardianes, nos aseguramos de que llegue aquí. En este lugar, los libros que ya nadie recuerda, los libros que se han perdido en el tiempo, viven para siempre, esperando llegar algún día a las manos de un nuevo lector, de un nuevo espíritu. En la tienda nosotros los vendemos y los compramos, pero en realidad los libros no tienen dueño. Cada libro que ves aquí ha sido el mejor amigo de alguien. Ahora sólo nos tienen a nosotros, Daniel. ¿Crees que vas a poder guardar este secreto?
                                
                Mi mirada se perdió en la inmensidad de aquel lugar, en su luz encantada. Asentí y mi padre sonrió.
                                
                —¿Y sabes lo mejor? —preguntó.
                                
                Negué en silencio.
                                
                —La costumbre es que la primera vez que alguien visita este lugar tiene que escoger un libro, el que prefiera, y adoptarlo, asegurándose de que nunca desaparezca, de que siempre permanezca vivo. Es una promesa muy importante. De por vida —explicó mi padre—. Hoy es tu turno.
                                
                Por espacio de casi media hora deambulé entre los entresijos de aquel laberinto que olía a papel viejo, a polvo y a magia. Dejé que mi mano rozase las avenidas de lomos expuestos, tentando mi elección. Atisbé, entre los títulos desdibujados por el tiempo, palabras en lenguas que reconocía y decenas de otras que era incapaz de catalogar. Recorrí pasillos y galerías en espiral pobladas por cientos, miles de tomos que parecían saber más acerca de mí que yo de ellos. Al poco, me asaltó la idea de que tras la cubierta de cada uno de aquellos libros se abría un universo infinito por explorar y de que, más allá de aquellos muros, el mundo dejaba pasar la vida en tardes de fútbol y seriales de radio, satisfecho con ver hasta allí donde alcanza su ombligo y poco más. Quizá fue aquel pensamiento, quizá el azar o su pariente de gala, el destino, pero en aquel mismo instante supe que ya había elegido el libro que iba a adoptar. O quizá debiera decir el libro que me iba a adoptar a mí. Se asomaba tímidamente en el extremo de una estantería, encuadernado en piel de color vino y susurrando su título en letras doradas que ardían a la luz que destilaba la cúpula desde lo alto. Me acerqué hasta él y acaricié las palabras con la yema de los dedos, leyendo en silencio.
                                
                La Sombra del Viento
                JULIÁN CARAX
                                
                Jamás había oído mencionar aquel título o a su autor, pero no me importó. La decisión estaba tomada. Por ambas partes. Tomé el libro con sumo cuidado y lo hojeé, dejando aletear sus páginas. Liberado de su celda en el estante, el libro exhaló una nube de polvo dorado. Satisfecho con mi elección, rehíce mis pasos en el laberinto portando mi libro bajo el brazo con una sonrisa impresa en los labios. Tal vez la atmósfera hechicera de aquel lugar había podido conmigo, pero tuve la seguridad de que aquel libro había estado allí esperándome durante años, probablemente desde antes de que yo naciese.
                                
                Aquella tarde, de vuelta en el piso de la calle Santa Ana, me refugié en mi habitación y decidí leer las primeras líneas de mi nuevo amigo. Antes de darme cuenta, me había caído dentro sin remedio. La novela relataba la historia de un hombre en busca de su verdadero padre, al que nunca había llegado a conocer y cuya existencia sólo descubría merced a las últimas palabras que pronunciaba su madre en su lecho de muerte. La historia de aquella búsqueda se transformaba en una odisea fantasmagórica en la que el protagonista luchaba por recuperar una infancia y una juventud perdidas, y en la que, lentamente, descubríamos la sombra de un amor maldito cuya memoria le habría de perseguir hasta el fin de sus días. A medida que avanzaba, la estructura del relato empezó a recordarme a una de esas muñecas rusas que contienen innumerables miniaturas de sí mismas en su interior. Paso a paso, la narración se descomponía en mil historias, como si el relato hubiese penetrado en una galería de espejos y su identidad se escindiera en docenas de reflejos diferentes y al tiempo uno solo. Los minutos y las horas se deslizaron como un espejismo. Horas más tarde, atrapado en el relato, apenas advertí las campanadas de medianoche en la catedral repiqueteando a lo lejos. Enterrado en la luz de cobre que proyectaba el flexo, me sumergí en un mundo de imágenes y sensaciones como jamás las había conocido. Personajes que se me antojaron tan reales como el aire que respiraba me arrastraron en un túnel de aventura y misterio del que no quería escapar. Página a página, me dejé envolver por el sortilegio de la historia y su mundo hasta que el aliento del amanecer acarició mi ventana y mis ojos cansados se deslizaron por la última página. Me tendí en la penumbra azulada del alba con el libro sobre el pecho y escuché el rumor de la ciudad dormida goteando sobre los tejados salpicados de púrpura. El sueño y la fatiga llamaban a mi puerta, pero me resistí a rendirme. No quería perder el hechizo de la historia ni todavía decir adiós a sus personajes.
                                
                En una ocasión oí comentar a un cliente habitual en la librería de mi padre que pocas cosas marcan tanto a un lector como el primer libro que realmente se abre camino hasta su corazón. Aquellas primeras imágenes, el eco de esas palabras que creemos haber dejado atrás, nos acompañan toda la vida y esculpen un palacio en nuestra memoria al que, tarde o temprano —no importa cuántos libros leamos, cuántos mundos descubramos, cuánto aprendamos u olvidemos—, vamos a regresar. Para mí, esas páginas embrujadas siempre serán las que encontré entre los pasillos del Cementerio de los Libros Olvidados.
                """, true, true);
        //Thread.sleep(2000);

        //System.err.println("La Sombra del Viento Chapter 1 First Paragraph");
        not_spanish not_spanish6 = new not_spanish("""
                Un secreto vale lo que aquellos de quienes tenemos que guardarlo. Al despertar, mi primer impulso fue hacer partícipe de la existencia del Cementerio de los Libros Olvidados a mi mejor amigo. Tomás Aguilar era un compañero de estudios que dedicaba su tiempo libre y su talento a la invención de artilugios ingeniosísimos pero de escasa aplicación práctica, como el dardo aerostático o la peonza dinamo. Nadie mejor que Tomás para compartir aquel secreto. Soñando despierto me imaginaba a mi amigo Tomás y a mí pertrechados ambos de linternas y brújula prestos a desvelar los secretos de aquella catacumba bibliográfica. Luego, recordando mi promesa, decidí que las circunstancias aconsejaban lo que en las novelas de intriga policial se denominaba otro modus operandi. Al mediodía abordé a mi padre para cuestionarle acerca de aquel libro y de Julián Carax, que en mi entusiasmo había imaginado célebres en todo el mundo. Mi plan era hacerme con todas sus obras y leérmelas de cabo a rabo en menos de una semana. Cuál fue mi sorpresa al descubrir que mi padre, librero de casta y buen conocedor de los catálogos editoriales, jamás había oído hablar de La Sombra del Viento o de Julián Carax. Intrigado, mi padre inspeccionó la página con los datos de la edición.
                """, true, true);
        //Thread.sleep(2000);


//        //System.err.println("Cipher - MLK, I've been to the Mountaintop");
//        not_spanish not_spanish7 = new not_spanish("""
//                hsyzz sgi gcdn eabojk, bs xftczsm. sg t juhnwbpb fd lszaf mqyjblrtn ufr sge tfgefczi ufr rcztlgid gzilgrfafxif oyb
//                fwyf hsmgvbl ommgi gqgpjr, x qgbocdtx ovz fq luk hljwxhy ommgi. cl'g ljipsk uzmp ii zogc kdoj qwmetml tcgqcx sbo
//                yehiuwlrq ii koj qabylvtls vigr lzajn qcf. yzs lszaf mqyjblrtn ck hsc ntml tcgqcx lvlr u wuns tl fwy occjp. x'g
//                vswgswnwr em ety wonf au sgi scdt ngbteti cf gagft ix o dragg oocluca. qcf pqkysz efmi sgi lpq sylsckucyv hz ea dh
//                sbjfal.
//                """, true, true);
        //Thread.sleep(2000);

        //System.err.println("Cipher - FDR, Pearl Harbor Address");
//        sample.not_spanish not_spanish8 = new not_spanish("""
//                Bv. Vznt Trvdxheee, Bv. Sgppoei, Xtqbvch sf kst Weelii, aeo dj typ Wsujp dj Rvagisvyietzgtw:
//
//                Yvdiiruln, Hetpbfei 7ew, 1941 -- e dret ahznw aicw amvv tc mnwlbc -- typ Jrikps Wtretw ow Lbirznp aaj djhdvyac aeo silzmtvakpac akepgkvo qc nrgpp aeo pmr wzggej zu xhv Pbtiip dj Jrapr.
//
//                Typ Jrikps Wtretw wrd px pvlri wzew xhre cetzzc enu, li xhv ddpittietzzc sf Aleen, nlh wtzwa mn tzczeidpxify lmty tiw gfgtvndpcx aeo xxs vxeirfc asobtck tfhpvd kst qazyiinryri ow atecv tc xhv Apgiwtr.
//
//                Mnupth, oep wsui luxei Uptaephi azc huurogsnj sph cfxbintps fodmxrg zy ile Rxtvitlc msclch ow Zplu, kst Naglcisv lbfajdphoi ed xhv Fcmtvo Hxakph enu sxw cfwaiaxft hectkirvo is olc Hicipierp zu Wtret e ffcbel ipepy kz p vetpcx Adpgmcry bisjlvi. Aeo llicp ilij cttlp dietvo ilak ti wevxth ujpaisj ed goeexruv ewi eothxier smpczbetzn cigfexetzzcw, ik ndrtrtcid ez ilrvli sr ytcx ow hpv oi zu erdps etklro.1
//
//                Ik hxpl sp gicfcsid kspx typ smsklcge fq Wewrtx jrfx Yepry bekvd xx osgxsuj ewet kst etklro wrd silzmtvakpac pclcreu xpry ulnw oi pkin nptos rrd. Huitck typ xrtvckinzyv xidp, ile Aleenvdt kompgrmvyi laj otpispgetvwn wolrwx tf otgezgt xhv Fcmtvo Hxakph fy wlawe jepxedpcxs rys ixgctwszzcw ow sdte wzg goeexruvo eiatp.
//
//                Ile reiecb jtwtvcsey fy ile Ylleizlc msclchs ylh galdth svgtve ulbegv ed Emvcxgae ypzac lch mzwxxaij usrtph. M rvrgit kz iilc jdy tyli zeij benp Lbirznpr lzgtw hrgt fevy assk. Tc edutimoe, Lbirznpr sytew hrgt fevy gipfciid kzgteuzth oe ewi hzrw werd qitnptr Sry Uvaenxwcf lch Hfydpucf.
//
//                Niskpghap, ewi Jraprejp vsvvccqeee ppsf wpyntsth ae lixatv pkazyhx Mrwpca.
//
//                Clhx nzrwx, Jraprejp usrtph etklroeu Sdrg Bzck.
//
//                Lrdi rixsi, Naglcisv qdvcvd pxtrnzid Xfpq.
//
//                Lrdi rixsi, Naglcisv qdvcvd pxtrnzid kst Thzwxtpzyt Msclchs.
//
//                Clhx nzrwx, typ Yeprytwe reiecbps Aabp Xwlrys.
//
//                Enu ewms dzgrier, ile Aleenvdt etklroeu Xxhwrj Xwlrys.
//
//                Naglc laj, ewirvqdve, lysirklzin r djvpithi owqtrszgt ixkpchier ilrffvlole ile Glrmfzn pver. Ewi frniw ow jtwtvcsey rys xouln wpvlz joi ewimjpazej. Ewi pvzepe fq ile Lyxxeu Dietvd wevv laveron joixth typxv ogtcmoed prd npap ueotvsklch typ xqpctretzzcw tf ewi vvcn piwp prd jluitp zu sui ypxify.
//
//
//
//                Pw Cfxbenupg mn Tsxif fq ile Rcbc aeo Cevp, T wevv oxveteth tyli elc xteslctw bv epoee qdv olc sifvyhi. Ble ppwrjh aicw dyr nsdpe elimoe ctqedmtv typ rlailrxei zu xhv zcwlrfvlt rrpmnje jw.
//
//                Nf xpxtvc wsw czck ik xpc trvt ys kz dzeindqe ksxw pipbidzepxeu tczajtdr, typ Pqeitren gpdtlv tc xhvtg vixsiiold bmgye lmlc hxr tycdygy ed ebjzaytv gxgtfcn.
//
//                M bvwxivv ewet Z tcxeiagit kst aicw dj typ Rsnxctws rys sf kst tefaai wypc M ajdtvt kspx wv hxpl ezi sncj sifvys suidtpvvd is typ jxtvcbssk, mjx wzwa qabp xx vvcn geiepmn kspx tyth joix dj tippghvcn whrwa rempg egrtc inulckei fh.
//
//                Lojexpikttw eothx. Typgi ij yd flzyzmnx li xhv qpgt kspx olc eiogwt, sui etvrzedvy, rys sui tcxeiphxs rct mn xcpze ulckei.
//
//                Hxxh tzcjiupcge zy dyr rcbid wzggej, hxxh kst ynszjrdzyv hekpgqielimoe zu sui atspcp, li wzwa kazy ile zytziklqpe kcxymgs -- hs hvwe ys Xzs.
//
//                M ajv ilak ewi Cfyvvejd sicclgi tyli wient xhv fctrfgdoeu lch drdieruwn etklro bp Uptae zc Wueopc, Dvntqbvc 7il, 1941, a jepxe fq ler ylh ixzdiid spiaevy ile Lyxxeu Dietvd prd kst Naglcisv pbtiip.
//                """,true, true);
        //Thread.sleep(2000);
        double SpanishAverageValidityFactor = (not_spanish.getValidityFactor()+ not_spanish2.getValidityFactor()+ not_spanish3.getValidityFactor()+ not_spanish5.getValidityFactor()+ not_spanish6.getValidityFactor())/5;
        //System.err.println("Spanish Average Validity Factor");
        //System.out.println(SpanishAverageValidityFactor);
        //Thread.sleep(2000);

        double NotSpanishNotCipherAverageValidityFactor = (not_spanish1.getValidityFactor()+ not_spanish4.getValidityFactor())/2;
        //System.err.println("Not Spanish Not Cipher Average Validity Factor");
        //System.out.println(NotSpanishNotCipherAverageValidityFactor);
        //Thread.sleep(2000);
//        double CipherAverageValidityFactor = (not_spanish7.getValidityFactor() + not_spanish8.validityFactor)/2;
        //System.err.println("Cipher Average Validity Factor ");
        //System.out.println(CipherAverageValidityFactor);
        double rtn = NotSpanishNotCipherAverageValidityFactor;
        boolean big = rtn > 0.4*SpanishAverageValidityFactor;
        if (!big){
            rtn = rtn * 2;
        }
        return rtn;
    }
}
