package com.example.githubuser;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private List<User> dataList;
    private Context context;

    public CustomAdapter(Context context, List<User> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private  final View mView;
        private TextView text_login_url;
        private TextView text_avatar_url;

        public CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            text_avatar_url = mView.findViewById(R.id.text_avatar_url);
            text_login_url = mView.findViewById(R.id.text_login_url);
        }
    }
    @Override
    public CustomAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.content_main,parent,false);
        return new CustomAdapter.CustomViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.CustomViewHolder holder, int position) {
        holder.text_avatar_url.setText(dataList.get(position).getAvatar_url());
        holder.text_login_url.setText(dataList.get(position).getLogin());
    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
