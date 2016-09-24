package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cordell on 7/25/2016.
 */
public class UserQuery{

    private String name;
    public String resultsTitle;
    private Document docSaved;
    //public List<String>;

    public UserQuery() {};

    public boolean getInput(String input) throws IOException{

        boolean output = true;
        if(input.equals(" ")){
            output = false;
        }        String query = "https://www.google.com/search?q="+input;
        Document doc = Jsoup.connect(query).userAgent("Mozilla/5.0").timeout(5000).get();
        setDocument(doc);
        if(doc != null){
            setResultsTitle(doc);
        }
        return output;
    }
    public void setDocument(Document s ){
        this.docSaved = s;
    }
    public Document getDocument(){
        return docSaved;
    }

    public void printElements(Document doc){
        //Element e =
         System.out.println(doc.getAllElements().toString());
    }


    public void setResultsTitle(Document docInput){
        this.resultsTitle = docInput.title();
    }

    public String getDocTitle(){
        return this.resultsTitle;
    }

    public String getContent(){

        return name;
    }

    @Override
    public List<String> parseSearchResults(String x){
        List<String> output = new ArrayList<>();

        return output;
    }
}
