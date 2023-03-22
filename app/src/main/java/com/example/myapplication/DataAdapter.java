package com.example.myapplication;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>{
    private ArrayList<MandayResponse> MANDAY;

    public DataAdapter(ArrayList<MandayResponse> MANDAY) {
        this.MANDAY = MANDAY;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        holder.tv_EstateId.setText("EstateId: " + MANDAY.get(position).getEstateID());
        holder.tv_Estate.setText(MANDAY.get(position).getEstate());
        holder.tv_RollCall.setText("RollCall: " + MANDAY.get(position).getRollcall());
        holder.tv_Mandays.setText("Manday: " + MANDAY.get(position).getMandays());
        holder.tv_Attendance.setText("Attendance: " + MANDAY.get(position).getAttendance());
        holder.tv_NoofHarvester.setText("NoHarvester: " + MANDAY.get(position).getNoofHarvester());
        holder.tv_TotalHarvester.setText("TotalHarvester: " + MANDAY.get(position).getTotalHarvester());
        holder.tv_Productivity.setText("Productivity: " + MANDAY.get(position).getProductivity());
        holder.tv_TotBunchActual.setText("TotalBunchActual: " + MANDAY.get(position).getTotBunchActual());
        holder.tv_Budget.setText("Budget: " + MANDAY.get(position).getBudget());
        holder.tv_Variance.setText("Variance: " + MANDAY.get(position).getVariance());
        holder.tv_tonnageactual.setText("TonnageActual: " + MANDAY.get(position).getTonnageactual());
        holder.tv_estimate.setText("Estimate: " + MANDAY.get(position).getEstimate());
        holder.tv_tonnagevariance.setText("TonnageVariance: " + MANDAY.get(position).getTonnagevariance());
    }

    @Override
    public int getItemCount() {
        return MANDAY.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_EstateId;
        private TextView tv_Estate;
        private TextView tv_RollCall;
        private TextView tv_Mandays;
        private TextView tv_Attendance;

        private TextView tv_NoofHarvester;
        private TextView tv_TotalHarvester;
        private TextView tv_Productivity;
        private TextView tv_TotBunchActual;
        private TextView tv_Budget;
        private TextView tv_Variance;
        private TextView tv_tonnageactual;
        private TextView tv_estimate;
        private TextView tv_tonnagevariance;


        public ViewHolder(View itemView) {
            super(itemView);

            tv_EstateId = (TextView)itemView.findViewById(R.id.tv_EstateId);
            tv_Estate = (TextView)itemView.findViewById(R.id.tv_Estate);
            tv_RollCall = (TextView)itemView.findViewById(R.id.tv_RollCall);
            tv_Mandays = (TextView)itemView.findViewById(R.id.tv_Mandays);
            tv_Attendance = (TextView)itemView.findViewById(R.id.tv_Attendance);
            tv_NoofHarvester = (TextView)itemView.findViewById(R.id.tv_NoofHarvester);
            tv_TotalHarvester = (TextView)itemView.findViewById(R.id.tv_TotalHarvester);
            tv_Productivity = (TextView)itemView.findViewById(R.id.tv_Productivity);
            tv_TotBunchActual = (TextView)itemView.findViewById(R.id.tv_TotBunchActual);
            tv_Budget = (TextView)itemView.findViewById(R.id.tv_Budget);
            tv_Variance = (TextView)itemView.findViewById(R.id.tv_Variance);
            tv_tonnageactual = (TextView)itemView.findViewById(R.id.tv_tonnageactual);
            tv_estimate = (TextView)itemView.findViewById(R.id.tv_estimate);
            tv_tonnagevariance = (TextView)itemView.findViewById(R.id.tv_tonnagevariance);
        }
    }
}
