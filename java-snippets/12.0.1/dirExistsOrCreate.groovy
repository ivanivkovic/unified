def dirExistsOrCreate(String path){
    File location = new File(path)
    if (!location.exists()) {
        location.mkdir()
    }
}
