package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder>{
    private List<Song> songList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvRank,tvSongName,tvSinger,tvYear;
        public ImageView ivAlbumCover;

        public ViewHolder(View view){
            super(view);
            tvRank = (TextView)view.findViewById(R.id.tvRank);
            tvSongName = (TextView)view.findViewById(R.id.tvSongName);
            tvSinger = (TextView)view.findViewById(R.id.tvSinger);
            tvYear = (TextView)view.findViewById(R.id.tvYear);
            ivAlbumCover = (ImageView)view.findViewById(R.id.ivAlbumCover);
        }
    }
    public SongAdapter(List<Song> songList){
        this.songList = songList;
    }
    @Override
    public SongAdapter.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(SongAdapter.ViewHolder holder, int position){
        Song song = songList.get(position);
        holder.tvRank.setText(String.valueOf(song.getRank()));
        holder.tvSongName.setText(song.getName());
        holder.tvSinger.setText(song.getSinger());
        holder.tvYear.setText(song.getYear());
        holder.ivAlbumCover.setImageResource(song.getPic());
        holder.tvYear.setText("2016");
    }
    @Override
    public int getItemCount(){
        return songList.size();
    }
}

