package net.jeqo.bloons.balloon.single;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents the contents of a configuration for a single balloon
 */
@Getter @Setter
public class SingleBalloonType {
    private String key;
    private String id;
    private String permission;
    private String material;
    private String color;
    private int customModelData;
    private String name;
    private String[] lore;

    /**
     *                          Creates a new single balloon type configuration
     * @param key               The key of the balloon type in the configuration, type java.lang.String
     * @param id                The unique identifier for the balloon type, type java.lang.String
     * @param permission        The permission required to use the balloon type, type java.lang.String
     * @param material          The name of the Bukkit Material used to create the item, type java.lang.String
     * @param color             The color of the model as a hex color code value, type java.lang.String
     * @param customModelData   The custom model data value stored in the item metadata, type int
     * @param name              The name of the balloon, type java.lang.String
     * @param lore              The lore of the balloon, type java.lang.String[]
     */
    public SingleBalloonType(String key, String id, String permission, String material, String color, int customModelData, String name, String[] lore) {
        this.setKey(key);
        this.setId(id);
        this.setPermission(permission);
        this.setMaterial(material);
        this.setColor(color);
        this.setCustomModelData(customModelData);
        this.setName(name);
        this.setLore(lore);
    }
}