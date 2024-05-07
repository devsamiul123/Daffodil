function toggleSidebar() {
    var sidebar = document.getElementById('sidebar');
    var main = document.getElementById('content');
    if (sidebar.style.display === 'none' || !sidebar.style.display) {
      sidebar.style.display = 'block';
      main.style.marginLeft = '250px';
    } else {
      sidebar.style.display = 'none';
      main.style.marginLeft = '0px';
    }
  }
  