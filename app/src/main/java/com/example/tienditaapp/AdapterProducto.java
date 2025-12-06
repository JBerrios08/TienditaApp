package com.example.tienditaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AdapterProducto extends RecyclerView.Adapter<AdapterProducto.ViewHolderProducto> {

    private List<Producto> listaProductos;  // Lista de productos

    public AdapterProducto(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public ViewHolderProducto onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflar el layout del item de producto
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_producto, parent, false);
        return new ViewHolderProducto(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolderProducto holder, int position) {
        // Obtener el producto en la posición indicada
        Producto producto = listaProductos.get(position);

        // Establecer los valores en los TextViews
        holder.nombreTextView.setText(producto.getNombre());
        holder.precioTextView.setText("$" + producto.getPrecio());
        holder.stockTextView.setText("Stock: " + producto.getStock());
    }

    @Override
    public int getItemCount() {
        // Devolver el tamaño de la lista de productos
        return listaProductos.size();
    }

    // ViewHolder para los elementos del RecyclerView
    public static class ViewHolderProducto extends RecyclerView.ViewHolder {
        public TextView nombreTextView, precioTextView, stockTextView;

        public ViewHolderProducto(View itemView) {
            super(itemView);
            // Inicializar los TextViews
            nombreTextView = itemView.findViewById(R.id.productoNombre);
            precioTextView = itemView.findViewById(R.id.productoPrecio);
            stockTextView = itemView.findViewById(R.id.productoStock);
        }
    }
}
