package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    public static Properties properties;
    // confıg.properties dosyasını okuyabilmek için bir static nesne olusturduk
    // medem static --> Testlerim baslamadan hemen classda olusturulsun istiyorum
    //              --> Objeden bagımsız olsun istiyorum


    static {
        // neden static blok --> olusturdugumuz nesneye hemen diğer işlemlerden önce değer atamak istiyoruz
        //                   --> bu nesne hangi dosyayı okuyacak ? ( config.properties ı okuyacak )
        //                   --> okuyacagı dosyayı tanıtacagız

        // dosyanın yolunu aldık
        String filePath = "config.properties";



                // Javada dosya okumak için gerkli olan class FileInputStream
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);
            // bos bir tane pr. nesnesı olustur
            properties = new Properties();
            // nesnenın içine doyayı yukle
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String getProperty(String key) {
        // projenın herhangi bir yerinden ulasacagımız icin public static

        return properties.getProperty(key);
    }
}