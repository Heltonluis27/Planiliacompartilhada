class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val startButton = findViewById<Button>(R.id.startButton)

        titleTextView.text = "Title"
        startButton.setOnClickListener {
            // Add your start button logic here
        }
    }
}
