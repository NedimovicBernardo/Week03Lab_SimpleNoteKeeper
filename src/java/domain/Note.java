
package domain;

import java.io.*;

/**
 *
 * @author 816076
 */
public class Note implements Serializable
{
    private String title, contents;

    public Note() 
    {
        this.title = "";
        this.contents = "";
    }

    public Note(String title, String contents) 
    {
        this.title = title;
        this.contents = contents;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getContents() 
    {
        return contents;
    }

    public void setContents(String contents) 
    {
        this.contents = contents;
    }
    
    
}
