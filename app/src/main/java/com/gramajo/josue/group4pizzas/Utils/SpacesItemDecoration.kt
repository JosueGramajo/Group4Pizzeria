package com.gramajo.josue.group4pizzas.Utils

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by josuegramajo on 10/31/18.
 */
class SpacesItemDecoration : RecyclerView.ItemDecoration{
    var mSpace = 0

    constructor(space:Int){
        mSpace = space
    }

    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        //super.getItemOffsets(outRect, view, parent, state)
        outRect!!.left = mSpace
        outRect!!.right = mSpace
        outRect!!.bottom = mSpace

        if(parent!!.getChildAdapterPosition(view) == 0){
            outRect!!.top = mSpace
        }
    }
}