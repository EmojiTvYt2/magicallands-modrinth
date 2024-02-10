package net.justmili.magicallands;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MagicallandsMod implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "magicallands";

    public MagicallandsMod() {
    }

    public void onInitialize() {
        LOGGER.info("Loading Modpack Resources...");
    }
}
