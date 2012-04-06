/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author abaddon
 */
public class Playlist {
    private String playlistName;
    private List<Song> playlist;
    public Playlist(String string) 
    {
     playlistName = string;
     playlist = new LinkedList();
    }
    public String getName()
    {
        return playlistName;
    }
    
    public void addSong(Song songToAdd)
    {
        playlist.add(songToAdd);
    }
    
    public int songCount()
    {
        return playlist.size();
    }
    public void removeSong(Song songToRemove)
    {
        playlist.remove(songToRemove);
    }
    public boolean songExists(Song songToCheck)
    {
       return playlist.contains(songToCheck); 
    }
}
