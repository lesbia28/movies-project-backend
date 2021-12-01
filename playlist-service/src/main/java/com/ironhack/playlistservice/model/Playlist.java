package com.ironhack.playlistservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

//id
//name:
//author:
//moviesList

@Document(collection = "playlist")
public class Playlist {
 @Id
private String id;
private String name;
private String author;
private ArrayList<String> movieList;

 public Playlist() {
//  movieList=new ArrayList<>();
 }

 public Playlist(String id, String name, String author, ArrayList<String> movieList) {
  this.id = id;
  this.name = name;
  this.author = author;
  this.movieList = movieList;
 }

 public String getId() {
  return id;
 }

 public void setId(String id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getAuthor() {
  return author;
 }

 public void setAuthor(String author) {
  this.author = author;
 }

 public ArrayList<String> getMovieList() {
  return movieList;
 }

 public void setMovieList(ArrayList<String> movieList) {
  this.movieList = movieList;
 }
}
