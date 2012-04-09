/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;

import java.util.Comparator;


/**
 *
 * @author abaddon
 */
public class Song implements Comparable<Song>
{
    private String title;
    private String artist;
    
    public Song(String trackTitle, String trackArtist)
    {
        title = trackTitle;
        artist = trackArtist;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    
    
    @Override
    public int compareTo(Song songToCompare) 
    {
    int result = this.getArtist().compareToIgnoreCase(songToCompare.getArtist());
     if(result == 0)
     {
         result = this.getTitle().compareToIgnoreCase(songToCompare.getTitle());
     }
    return result; 
    }
  


    @Override
    public String toString()
    {
        return title + artist;
    }
    
}
