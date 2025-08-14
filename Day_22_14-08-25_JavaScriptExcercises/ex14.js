
   
    function checkLoginStatus() {
      if (localStorage.getItem('userId')) {
        document.getElementById('login-button').style.display = 'none';
        document.getElementById('logout-button').style.display = 'inline';
      } else {
        document.getElementById('login-button').style.display = 'inline';
        document.getElementById('logout-button').style.display = 'none';
      }
    }

    function login() {
      const userId = document.getElementById('userId').value;
      if (userId) {
        localStorage.setItem('userId', userId); 
        checkLoginStatus(); 
        console.log('User logged in:', userId);
      }
    }

    function logout() {
      localStorage.removeItem('userId'); 
      checkLoginStatus(); 
      console.log('User logged out');
    }
    checkLoginStatus();
    document.getElementById('login-button').addEventListener('click', login);
    document.getElementById('logout-button').addEventListener('click', logout);
