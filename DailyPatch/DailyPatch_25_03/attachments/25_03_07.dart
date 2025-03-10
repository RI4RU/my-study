import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "my first app",
      home: Scaffold(
        appBar: AppBar(
          title: Text("Home"),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text("text",
                style: TextStyle(
                fontSize: 30,
                color: Colors.red,
                ),
              ),
              SizedBox.fromSize(
                size: Size.fromHeight(20),
              ),
              Container(
                width: 300,
                height: 200,
                padding: EdgeInsets.all(20),
                margin: EdgeInsets.all(20),
                decoration: BoxDecoration(
                  color: Colors.deepOrange,
                  border: Border.all(
                    color: Colors.lightGreen,
                    width: 1,
                  ),
                borderRadius: BorderRadius.circular(5),
                ),
                child: Text("Hello"),
              ),
              Text("World"),
            ],
          ),
        ),
      ),
    );
  }
}
