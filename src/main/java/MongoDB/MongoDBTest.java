package MongoDB;

import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class MongoDBTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Mongo m=new Mongo("localhost",27017);
		DB db=m.getDB("mydb");
		Set<String> colls=db.getCollectionNames();
		for(String s:colls){
			System.out.println(s);
		}
	DBCollection coll=db.getCollection("user");
	BasicDBObject doc=new BasicDBObject();
	doc.put("name", "MongoDB");
	doc.put("type","database");
	doc.put("count",1);
	coll.insert(doc);
	DBObject myDoc=coll.findOne();
 for(int i=0;i<100;i++){
    coll.insert(new BasicDBObject().append("i", i));
	}
   System.out.println(coll.getCount());
}
}
