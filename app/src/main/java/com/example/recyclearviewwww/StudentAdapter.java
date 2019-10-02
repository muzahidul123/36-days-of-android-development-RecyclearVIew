package com.example.recyclearviewwww;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    private List<Student> studentList;

    public StudentAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_user_design, parent, false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Student student = studentList.get(position);

        holder.nameTV.setText(student.getName());
        holder.idTV.setText(String.valueOf(student.getId()));
        holder.emailTV.setText(student.getEmail());
        holder.phonenoTV.setText(student.getPhoneNo());
        holder.profileIV.setImageResource(student.getProfilepic());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTV, idTV, emailTV, phonenoTV;
        private ImageView profileIV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.nameTV);
            idTV = itemView.findViewById(R.id.idTV);
            emailTV = itemView.findViewById(R.id.emailTV);
            phonenoTV = itemView.findViewById(R.id.phonenoTV);
            profileIV = itemView.findViewById(R.id.profileIV);
        }
    }
}
