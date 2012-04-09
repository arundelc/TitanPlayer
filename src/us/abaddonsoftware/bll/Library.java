/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;


import java.util.*;

/**
 *
 * @author abaddon
 */
public class Library 
{
    private TreeSet<Song> songs;
    public Library()
    {
        songs = new TreeSet<Song>();
    }
    
    public int songCount()
    {
     return songs.size(); 
    }


    public TreeSet<Song> getAllSongsInLibrary()
    {
        return songs;
    }
    
 /*       public void printAllSongsInLibrary()
    {
        System.out.println(songs);   //useful function for debugging output of sorts
    }
*/
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

    public void sortByArtist()
    {
        ByArtist comp = new ByArtist();                 //redundant code inserted for uniformity
        TreeSet<Song> newSet = new TreeSet<Song>(comp); //default sort of list as determined by
        newSet.addAll(songs);                           //compareto is by Artist
        songs = newSet;
    }
    
    public void sortByTitle()
    {
        ByTitle comp = new ByTitle();
        TreeSet<Song> newSet = new TreeSet<Song>(comp); 
        newSet.addAll(songs);                            
        songs = newSet;                                 
    }                                                   
    public class ByArtist implements Comparator<Song>
{

    @Override
    public int compare(Song song1, Song song2) 
 {
     int result = song1.getArtist().compareToIgnoreCase(song2.getArtist());
     if(result == 0)
     {
         result = song1.getTitle().compareToIgnoreCase(song2.getTitle());
     }
    return result;
 }
}
        public class ByTitle implements Comparator<Song>
{

    @Override
    public int compare(Song song1, Song song2) 
  {
     int result = song1.getTitle().compareToIgnoreCase(song2.getTitle());
     if(result == 0)
     {
         result = song1.getArtist().compareToIgnoreCase(song2.getArtist());
     }
    return result;
   // return song1.getArtist().compareTo(song2.getArtist());
   }
    
}
} 


