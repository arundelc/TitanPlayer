/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;


import java.util.TreeSet;

/**
 *
 * @author abaddon
 */
public class Library {
    TreeSet<Song> songs;
    
    public Library()
    {
     songs = new TreeSet<Song>(); 
    }
    
    public int songCount()
    {
     return songs.size(); 
    }
    
    public void addSong(Song newSong)
    {
     songs.add(newSong);
    }

    public void removeSong(Song songToRemove)
    {
      songs.remove(songToRemove);
    }
    public boolean songExists(Song songToCheck)
    {
      return songs.contains(songToCheck);
    }
}
