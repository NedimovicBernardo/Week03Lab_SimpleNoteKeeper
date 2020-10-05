
package servlets;

import domain.Note;
import java.io.*;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 816076
 */
public class NoteServlet  extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String title = "test", contents = "test";
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        Scanner read = new Scanner(new File(path));
        
        if(read.hasNextLine())
        {
            title = read.nextLine();
        }
        
        
        while(read.hasNext())
        {
            contents = read.next();
        }
        
        Note note = new Note(title, contents);
        request.setAttribute("note", note);
        
        read.close();
        
        if(request.getParameter("edit") != null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        else
        {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
        String title, contents;
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to write to a file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
        
        title = request.getParameter("editTitle");
        contents = request.getParameter("editContents");
        
        
        
        pw.print(title + "/n" + contents);
        
        Note note = new Note(title, contents);
        request.setAttribute("note", note);
        
        pw.close();
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

}