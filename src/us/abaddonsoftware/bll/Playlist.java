/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;

import java.util.List;

/**
 *
 * @author abaddon
 */
public class Playlist {
    String playlistName;
    List<Song> playlist;
    public Playlist(String string) 
    {
     playlistName = string;
    }
    
}
