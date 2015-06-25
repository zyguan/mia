package mia.recommender.ch02;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

import java.io.File;
import java.io.IOException;

public class Utils {
  public static DataModel parseArgs(String[] args) throws IOException {
    File modelFile = null;
    if (args.length > 0)
      modelFile = new File(args[0]);
    if(modelFile == null || !modelFile.exists())
      modelFile = new File("intro.csv");
    if(!modelFile.exists()) {
      System.err.println("Please, specify name of file, or put file 'input.csv' into current directory!");
      System.exit(1);
    }
    return new FileDataModel(modelFile);
  }
}
