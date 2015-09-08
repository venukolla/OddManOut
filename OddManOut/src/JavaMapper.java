import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class JavaMapper extends
        Mapper<Object, Text, Text, IntWritable> {

    private final IntWritable ONE = new IntWritable();
    private Text word = new Text();

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        String[] csv = value.toString().split(",");
        for (String str : csv) {
            word.set("hi");
            ONE.set(Integer.parseInt(str));
            context.write(word, ONE);
        }
    }
}