/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abaddon
 */
public class Playlist 
{
    private String playlistName;
    private List<Song> playlist;
    
    public Playlist(String string) 
    {
     playlistName = string;
     playlist = new ArrayList();
    }
    public String getName()
    {
        return playlistName;
    }
    
    public Song getSongFromIndex(int index)
    {
        return playlist.get(index);
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
