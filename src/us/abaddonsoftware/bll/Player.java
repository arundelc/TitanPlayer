/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package us.abaddonsoftware.bll;

/**
 *
 * @author abaddon
 */
public class Player 
{
    private Playlist activePlaylist;
    private int index;
    private boolean isPlaying;
    private Song playingSong;   //currently not used but will be passed when play is implemented
    private Thread playingThread;  //preparing for thread stuff

    public void loadPlaylist(Playlist nameOfPlaylist)
    {
      activePlaylist = nameOfPlaylist;
      index = 0;
    }
    
    public boolean getIsPlaying()
    {
        return isPlaying;
    }
    public void playSong()
    {
        playingSong = getCurrentSong();
        isPlaying = true;              //will later set from isAlive()?
    }
    
    public void stopSong()
    {
        isPlaying = false; //will later set from isAlive()?
    }
    
    public Song getCurrentSong()
    {
     if(index < 0 ) { index = 0; }              
       if (index >= activePlaylist.songCount())
       {
           index = activePlaylist.songCount() - 1;
       }
       return activePlaylist.getSongFromIndex(index);
    }
    
    public Song getNextSong()
    {
        index++;
        return getCurrentSong();
    }
    
    public Song getPrevSong()
    {
        index--;
        return getCurrentSong();
    }


    
}
