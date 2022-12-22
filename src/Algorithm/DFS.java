/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm;

//import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class DFS {
    public static boolean searchPath(int maze[][],int x,int y, List<Integer> path){
        if(maze[x][y]==9) return true;
        
        if(maze[x][y]==0){
            maze[x][y]=2;
            
            int[]dx={-1,1,0,0};
            int[]dy={0,0,-1,1};
            
            for(int d=0;d<4;d++){
                int newx= x+dx[d];
                int newy= y+dy[d];
                
                if(newx>=0 && newy>=0 && newx<maze.length && newy<maze[0].length && searchPath(maze,newx,newy,path)){
                    
                    path.add(x);
                    path.add(y);
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[]args){
        
       // DFS obj= new DFS();
      //  List<Integer> path = new ArrayList<Integer>();
       // searchPath(maze,0,0,path);
    }
    
}
