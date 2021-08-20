package egemensener_hw2;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class egemensener_hw2 extends Application {
    
    TextField[][] txtField = new TextField[4][4];
    String[][] temp1 = new String[4][4];
    
    Button btnCheck = new Button("CHECK");
    Label lblResult = new Label("Click Below");
        
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(5);
        grid.setHgap(5);
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                txtField[i][j] = new TextField();
                txtField[i][j].setMaxHeight(50);
                txtField[i][j].setMaxWidth(25);
                grid.add(txtField[i][j], i, j);
            }
        }
        // Set background color
        for(int h = 0 ; h < 2 ; h++){
            for(int z = 0 ; z < 2 ; z++){
               txtField[h][z].setStyle("-fx-background-color: #add8e6;");
                
            }
        }
        for(int h = 2 ; h < 4 ; h++){
            for(int z = 2 ; z < 4 ; z++){
                txtField[h][z].setStyle("-fx-background-color: #add8e6;");
                
            }
        }
        
        
        
        btnCheck.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(boardFull() == true){
                    if(numberChecker() == false){
                    if(checkResult() == true){
                        lblResult.setText("Correct Solution");
                    }else{
                        lblResult.setText("Incorrect Solution");
                    }
                    }
                }else{
                    lblResult.setText("Please fill all cells.");
                }
            }
        
        });
        
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10,10,10,10));
        vbox.setSpacing(10);
        vbox.getChildren().addAll(grid,lblResult,btnCheck);

        Scene scene = new Scene(vbox, 300, 250);
        
        primaryStage.setTitle("SUDOKU");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public boolean boardFull(){
        for(int i = 0; i< 4; i++){
            for(int j = 0; j<4; j++){
                if(txtField[i][j].getText().isEmpty() == true){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean numberChecker(){ // Additional part that controls user enters between 1 - 4 numbers
        
        boolean a = false;
        
           for(int i = 0 ; i < 4 ; i++){
            
            for(int j = 0; j < 4; j++){
                
                 temp1[i][j] = txtField[i][j].getText();
                
            }
        }
         for(int i = 0 ; i < 4 ; i++){
            
            for(int j = 0; j < 4; j++){
                
                 if(!temp1[i][j].equals("1")){
                     if(!temp1[i][j].equals("2")){
                        if(!temp1[i][j].equals("3")){
                           if(!temp1[i][j].equals("4")){
                               lblResult.setText("Please enter a number between 1 and 4 ");
                               a = true;
                           }
                       }  
                     }
                 }
                 else{
                     a = false;
                 }
                
            }
        }
        
        return a;
    }
    
    public boolean checkResult(){

         boolean a = false;
         boolean b = false;
         boolean c = false;
         boolean d = false;
         boolean e = false;
         boolean f = false;
         boolean g = false;
         
         for(int i = 0 ; i < 4 ; i++){
            
            for(int j = 0; j < 4; j++){
                
                 temp1[i][j] = txtField[i][j].getText();
                
            }
        }
     
         
//<editor-fold defaultstate="collapsed" desc="First square">
 
           if(!temp1[0][0].equals(temp1[1][0])){
                      
                      if(!temp1[0][0].equals(temp1[0][1])){
                        
                         if(!temp1[0][0].equals(temp1[1][1])){
                          
                          if(!temp1[1][0].equals(temp1[0][1])){
                          
                             if(!temp1[1][0].equals(temp1[1][1])){
                              
                                if(!temp1[0][1].equals(temp1[1][1])){
                              
                                    a= true;  }}}}}}
           
           else{
               
               a = false;
               
           }
 //</editor-fold> 
//<editor-fold defaultstate="collapsed" desc="Second square">        
 if(!temp1[2][0].equals(temp1[3][0])){
                      
                      if(!temp1[2][0].equals(temp1[2][1])){
                        
                         if(!temp1[2][0].equals(temp1[3][1])){
                          
                          if(!temp1[3][0].equals(temp1[2][1])){
                          
                             if(!temp1[3][0].equals(temp1[3][1])){
                              
                                if(!temp1[2][1].equals(temp1[3][1])){
                              
                                    b= true;  }}}}}}
           
           else{
               
               b = false;
               
           }
 //</editor-fold> 
//<editor-fold defaultstate="collapsed" desc="Third square">        
            if(!temp1[0][2].equals(temp1[1][2])){
                      
                      if(!temp1[0][2].equals(temp1[0][3])){
                        
                         if(!temp1[0][2].equals(temp1[1][3])){
                          
                          if(!temp1[1][2].equals(temp1[0][3])){
                          
                             if(!temp1[1][2].equals(temp1[1][3])){
                              
                                if(!temp1[0][3].equals(temp1[1][3])){
                              
                                    c= true;  }}}}}}
           
           else{
               
               c = false;
               
           }
 //</editor-fold> 
//<editor-fold defaultstate="collapsed" desc="Fourth square">        
            if(!temp1[2][2].equals(temp1[3][2])){
                      
                      if(!temp1[2][2].equals(temp1[2][3])){
                        
                         if(!temp1[2][2].equals(temp1[3][3])){
                          
                          if(!temp1[3][2].equals(temp1[2][3])){
                          
                             if(!temp1[3][2].equals(temp1[3][3])){
                              
                                if(!temp1[2][3].equals(temp1[3][3])){
                              
                                    d= true;  }}}}}}
           
           else{
               
               d = false;
               
           }
 //</editor-fold>  
 
 
  for(int k = 0; k < 4 ; k++){
           if(!temp1[k][0].equals(temp1[k][1])){
	      if(!temp1[k][0].equals(temp1[k][2])){
		if(!temp1[k][0].equals(temp1[k][3])){
		   if(!temp1[k][1].equals(temp1[k][2])){
                      if(!temp1[k][1].equals(temp1[k][3])){
			if(!temp1[k][2].equals(temp1[k][3])){
                               e = true;
                        }}}}}}
           else{
               e = false;
           }
  
  }
  
	for(int n = 0; n < 4 ; n++){
           if(!temp1[0][n].equals(temp1[1][n])){
	      if(!temp1[0][n].equals(temp1[2][n])){
		if(!temp1[0][n].equals(temp1[3][n])){
		   if(!temp1[1][n].equals(temp1[2][n])){
                      if(!temp1[1][n].equals(temp1[3][n])){
			if(!temp1[2][n].equals(temp1[3][n])){
                            f = true;
                            
            }}}}}}
           else{
               f = false;
               
           }
        
        }
 
    if(a == true){
        if(b == true){
            if(c==true){
                if(d==true){
                    if(e==true){
                        if(f==true){
                            g = true;
                        }
                    }
                }
            }
        }
    }
    return g;
    }
           
    
    
}
            