package com.rams.appollo.codeswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.rams.appollo.codeswag.Model.Category
import com.rams.appollo.codeswag.R

class CategoryAdapter(val context: Context, val categories: List<Category>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        // view created for first time. Second time it will go to else. - will help for performance improvement.
        if(convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null  )
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryView)
            holder.categoryName = categoryView.findViewById(R.id.categoryText)
            categoryView.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }
        val category = categories[position]
        // convert name to resource id.
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title


        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
       return categories.count()
    }

    private class ViewHolder{
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null

    }

}