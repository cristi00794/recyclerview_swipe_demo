package cristian.georgian.cristache.ro.recycleview_swipe_menu.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cristian.georgian.cristache.ro.recycleview_swipe_menu.R;
import cristian.georgian.cristache.ro.recycleview_swipe_menu.models.Player;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PlayerViewHolder> {

    private List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }

    public RecyclerViewAdapter(List<Player> players) {
        this.players = players;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.player_row, parent, false);

        return new PlayerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.PlayerViewHolder holder, int position) {
        Player player = players.get(position);
        holder.name.setText(player.getName());
        holder.nationality.setText(player.getNationality());
        holder.club.setText(player.getClub());
        holder.rating.setText(player.getRating().toString());
        holder.age.setText(player.getAge().toString());
    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    public class PlayerViewHolder extends RecyclerView.ViewHolder{

        private TextView name, nationality, club, rating, age;

        public PlayerViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            nationality = (TextView) view.findViewById(R.id.nationality);
            club = (TextView) view.findViewById(R.id.club);
            rating = (TextView) view.findViewById(R.id.rating);
            age = (TextView) view.findViewById(R.id.age);
        }
    }
}
