/**
 * @param urlString
 * @return filename
 */
String getFilenameFromURL(String urlString) {
    return urlString.substring(urlString.lastIndexOf("/") + 1)
}