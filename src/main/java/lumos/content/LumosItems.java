package lumos.content;

import mindustry.type.Item;

public class LumosItems {

    public static Item luminite, manganese, fullerine, uraninite, quartz, sulphur, uranium, thermite, sapphire, cogunite, lumosCrystal, plutonium, silicaGlass;
    public static void load(){
        luminite = new Item("luminite", Color.valueOf("7575c8")){{
         hardness = 1;
            cost = .40f;
        }};
        manganese = new Item("manganese", Color.valueOf("7575c8")){{
         hardness = 2;
            cost = .45f;
        }};
    }
        
}
