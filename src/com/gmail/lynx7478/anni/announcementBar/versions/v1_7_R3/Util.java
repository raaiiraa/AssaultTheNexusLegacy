package com.gmail.lynx7478.anni.announcementBar.versions.v1_7_R3;

import net.minecraft.server.v1_7_R3.DataWatcher;
import net.minecraft.server.v1_7_R3.EntityPlayer;
import net.minecraft.server.v1_7_R3.Packet;
import net.minecraft.server.v1_7_R3.PacketPlayInClientCommand;
import net.minecraft.server.v1_7_R3.PacketPlayOutEntityDestroy;
import net.minecraft.server.v1_7_R3.PacketPlayOutEntityMetadata;
import net.minecraft.server.v1_7_R3.PacketPlayOutSpawnEntityLiving;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_7_R3.entity.CraftPlayer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;

class Util
{
    public static final int ENTITY_ID = 1234; //Dragon

    public static void sendPacket(Player player, Packet packet)
    {
        EntityPlayer entityPlayer = ((CraftPlayer) player).getHandle();
        entityPlayer.playerConnection.sendPacket(packet);
    }

//    public static Field getField(Class<?> cl, String field_name)
//    {
//        try
//        {
//            Field field = cl.getDeclaredField(field_name);
//            return field;
//        }
//        catch (SecurityException e)
//        {
//            e.printStackTrace();
//        }
//        catch (NoSuchFieldException e)
//        {
//            e.printStackTrace();
//        }
//        return null;
//    }

//    //Accessing packets
//    @SuppressWarnings("deprecation")
//    public static PacketPlayOutSpawnEntityLiving getMobPacket(String text, Location loc){
//        PacketPlayOutSpawnEntityLiving mobPacket = new PacketPlayOutSpawnEntityLiving();
//
//        try {
//            Field a = getField(mobPacket.getClass(), "a");
//            a.setAccessible(true);
//            a.set(mobPacket, (int) ENTITY_ID);
//
//            Field b = getField(mobPacket.getClass(), "b");
//            b.setAccessible(true);
//            b.set(mobPacket, (byte) EntityType.WITHER.getTypeId());
//
//            Field c = getField(mobPacket.getClass(), "c");
//            c.setAccessible(true);
//            c.set(mobPacket, (int) Math.floor(loc.getBlockX() * 32.0D));
//
//            Field d = getField(mobPacket.getClass(), "d");
//            d.setAccessible(true);
//            d.set(mobPacket, (int) Math.floor(loc.getBlockY() * 32.0D));
//
//            Field e = getField(mobPacket.getClass(), "e");
//            e.setAccessible(true);
//            e.set(mobPacket, (int) Math.floor(loc.getBlockZ() * 32.0D));
//
//            Field f = getField(mobPacket.getClass(), "f");
//            f.setAccessible(true);
//            f.set(mobPacket, (byte) 0);
//
//            Field g = getField(mobPacket.getClass(), "g");
//            g.setAccessible(true);
//            g.set(mobPacket, (byte) 0);
//
//            Field h = getField(mobPacket.getClass(), "h");
//            h.setAccessible(true);
//            h.set(mobPacket, (byte) 0);
//
//            Field i = getField(mobPacket.getClass(), "i");
//            i.setAccessible(true);
//            i.set(mobPacket, (byte) 0);
//
//            Field j = getField(mobPacket.getClass(), "j");
//            j.setAccessible(true);
//            j.set(mobPacket, (byte) 0);
//
//            Field k = getField(mobPacket.getClass(), "k");
//            k.setAccessible(true);
//            k.set(mobPacket, (byte) 0);
//
//        } catch (IllegalArgumentException e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        } catch (IllegalAccessException e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        }
//
//        DataWatcher watcher = getWatcher(text, 300);
//
//        try{
//            Field t = PacketPlayOutSpawnEntityLiving.class.getDeclaredField("l");
//            t.setAccessible(true);
//            t.set(mobPacket, watcher);
//        } catch(Exception ex){
//            ex.printStackTrace();
//        }
//
//        return mobPacket;
//    }
//
//    public static PacketPlayOutEntityDestroy getDestroyEntityPacket(){
//        PacketPlayOutEntityDestroy packet = new PacketPlayOutEntityDestroy();
//
//        Field a = getField(packet.getClass(), "a");
//        a.setAccessible(true);
//        try {
//            a.set(packet, new int[]{ENTITY_ID});
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        return packet;
//    }
//
//    public static PacketPlayOutEntityMetadata getMetadataPacket(DataWatcher watcher){
//        PacketPlayOutEntityMetadata metaPacket = new PacketPlayOutEntityMetadata();
//
//        Field a = getField(metaPacket.getClass(), "a");
//        a.setAccessible(true);
//        try {
//            a.set(metaPacket, (int) ENTITY_ID);
//        } catch (IllegalArgumentException e1) {
//            e1.printStackTrace();
//        } catch (IllegalAccessException e1) {
//            e1.printStackTrace();
//        }
//
//        try{
//            Field b = PacketPlayOutEntityMetadata.class.getDeclaredField("b");
//            b.setAccessible(true);
//            b.set(metaPacket, watcher.c());
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//
//        return metaPacket;
//    }
//
//    public static PacketPlayInClientCommand getRespawnPacket(){
//        PacketPlayInClientCommand packet = new PacketPlayInClientCommand();
//
//        Field a = getField(packet.getClass(), "a");
//        a.setAccessible(true);
//        try {
//            a.set(packet, (int) 1);
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        return packet;
//    }
//
//    public static DataWatcher getWatcher(String text, int health){
//        DataWatcher watcher = new DataWatcher(null);
//
//        watcher.a(0, (Byte) (byte) 0x20); //Flags, 0x20 = invisible
//        watcher.a(6, (Float) (float) health);
//        watcher.a(10, (String) text); //Entity name
//        watcher.a(11, (Byte) (byte) 1); //Show name, 1 = show, 0 = don't show
//        //watcher.a(16, (Integer) (int) health); //Wither health, 300 = full health
//
//        return watcher;
//    }
}
