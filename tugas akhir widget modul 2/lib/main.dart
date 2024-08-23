import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: NewsHomePage(),
    );
  }
}

class NewsHomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      length: 2,
      child: Scaffold(
        appBar: AppBar(
          title: Text('MyApp'),
          backgroundColor: Colors.red,
          bottom: TabBar(
            tabs: [
              Tab(text: 'BERITA TERBARU'),
              Tab(text: 'PERTANDINGAN HARI INI'),
            ],
          ),
        ),
        body: TabBarView(
          children: [
            NewsTab(),
            MatchTab(),
          ],
        ),
      ),
    );
  }
}

class NewsTab extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return ListView(
      children: [
        // Featured news card
        Padding(
          padding: const EdgeInsets.all(8.0),
          child: Card(
            elevation: 4.0,
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                Image.network(
                  'data:image/jpeg;base64,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', // Replace with your image URL
                  fit: BoxFit.cover,
                ),
                Padding(
                  padding: const EdgeInsets.all(8.0),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(
                        'Jogging pagi',
                        style: TextStyle(
                          fontSize: 18.0,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                      SizedBox(height: 8.0),
                      Container(
                        color: Color.fromARGB(255, 176, 167, 39),
                        padding: const EdgeInsets.all(4.0),
                        child: Text(
                          'Transfer',
                          style: TextStyle(
                            color: Colors.white,
                          ),
                        ),
                      ),
                    ],
                  ),
                ),
              ],
            ),
          ),
        ),
        // Other news cards
        Padding(
          padding: const EdgeInsets.all(8.0),
          child: Card(
            elevation: 4.0,
            child: Row(
              children: [
                Image.network(
                  'data:image/jpeg;base64,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', // Replace with your image URL
                  width: 100.0,
                  height: 100.0,
                  fit: BoxFit.cover,
                ),
                Expanded(
                  child: Padding(
                    padding: const EdgeInsets.all(8.0),
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text(
                          'Berenang',
                          style: TextStyle(
                            fontSize: 16.0,
                            fontWeight: FontWeight.bold,
                          ),
                        ),
                        SizedBox(height: 8.0),
                        Text(
                          'Barcelona  Feb 13, 2021',
                          style: TextStyle(
                            fontSize: 14.0,
                            color: Colors.grey[600],
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
              ],
            ),
          ),
        ),
        // Repeat other news cards as needed
      ],
    );
  }
}

class MatchTab extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Center(
      child: Text('Tab for match information goes here'),
    );
  }
}
