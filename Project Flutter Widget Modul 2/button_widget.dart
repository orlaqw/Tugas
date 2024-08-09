import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {  
  @override
  Widget build(BuildContext context) {  
    return MaterialApp(
      home: Scaffold(
       floatingActionButton: FloatingActionButton(
         onPressed: (){},
         child: Icon(Icons.thumb_down),
         backgroundColor: Colors.pink,
       ),
      ),
    );
  }
}