const cities = ["Pune", "Navi Mumbai", "Khalapur", "Latur", "Sangli", "Dharashiv", "Raigad"];

        function dropdown() {
            const sortedCities = cities.sort();
            const dropdown = document.getElementById("cityDropdown");
            sortedCities.forEach(city => {
                const option = document.createElement("option");
                option.value = city;
                option.textContent = city;
                dropdown.add(option);
            });
        }