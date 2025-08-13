const images = [
            "C:/Users/CSC/Desktop/image1.webp", 
            "C:/Users/CSC/Desktop/image2.webp", 
            "C:/Users/CSC/Desktop/snowleopard.jpg", 
            "C:/Users/CSC/Desktop/Deforestation.jpg", 
            "C:/Users/CSC/Desktop/image3.webp"
        ];
        let currentIndex = 0;
        function updateImage() {
            const imgElement = document.getElementById("galleryImage");
            imgElement.src = images[currentIndex];
        }
        function showPrevImage() {
            if (currentIndex > 0) {
                currentIndex--;
                updateImage();
            }
        }
        function showNextImage() {
            if (currentIndex < images.length - 1) {
                currentIndex++;
                updateImage();
            }
        }
        updateImage();