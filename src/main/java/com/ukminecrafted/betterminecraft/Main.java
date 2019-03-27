package com.ukminecrafted.betterminecraft;

import com.ukminecrafted.betterminecraft.init.ModItems;
import com.ukminecrafted.betterminecraft.proxy.CommonProxy;
import com.ukminecrafted.betterminecraft.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "betterminecraft";
    public static final String NAME = "Better Minecraft";
    public static final String VERSION = "1.0";

    public static CreativeTabs item = new CreativeTabs("item")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.MINI_COAL);
        }
    };

   // private static Logger logger;

 //   @EventHandler
  //  public void preInit(FMLPreInitializationEvent event)
  //  {
  //      logger = event.getModLog();
   // }

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
       // logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
