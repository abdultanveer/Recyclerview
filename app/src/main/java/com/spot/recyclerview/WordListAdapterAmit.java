package com.spot.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

/**
 * job of amit is to get data from abdul and view from aman viewholder
 * and populate data into the view[row]
 */
public class WordListAdapterAmit extends
        RecyclerView.Adapter<WordListAdapterAmit.WordViewHolderAman> {

    private final LinkedList<String> mWordList;
    private LayoutInflater mInflater;

    public WordListAdapterAmit(Context context, LinkedList<String> wordList) {
        //step2
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }




    /**
     * this is amit talking to aman
     * wooden plank/row/view is getting created
     * * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public WordViewHolderAman onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //step2a -- inflating the views[rows]
        View mItemView = mInflater.inflate(R.layout.wordlist_item_row, parent, false);
        return new WordViewHolderAman(mItemView, this);    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolderAman holder, int position) {
        //step 2b -- populating the data into the views
        String mCurrent = mWordList.get(position); //mWordList was given by abdul
        holder.wordItemView.setText(mCurrent);  //wordItemView was given by aman
    }

    /**
     * abdul is telling to amit as to how many data items abdul has
     * @return
     */
    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    public class WordViewHolderAman extends RecyclerView.ViewHolder{

        public final TextView wordItemView;
        final WordListAdapterAmit mAdapter;

        public WordViewHolderAman(View itemView, WordListAdapterAmit adapter) {
            super(itemView);
            wordItemView = (TextView) itemView.findViewById(R.id.textView_eachrow);
            this.mAdapter = adapter;
        }
    }
}
