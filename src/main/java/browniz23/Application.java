package browniz23;

import spark.Spark;

public class Application {
	
	public static void main(String[] args) {
		Spark.get("/hello/:name", (req, res) -> {
			return "Hello" + req.params(":name");
		});
		Spark.get("/hello", (req, res) -> {
			return "Hello" + req.queryParams("name");
		});
	}
}
