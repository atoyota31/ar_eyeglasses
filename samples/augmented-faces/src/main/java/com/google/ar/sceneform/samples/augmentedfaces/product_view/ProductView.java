package com.google.ar.sceneform.samples.augmentedfaces.product_view;
import androidx.appcompat.app.AppCompatActivity;
import com.google.ar.sceneform.samples.augmentedfaces.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.ar.sceneform.samples.augmentedfaces.product_catalog.ProductCatalog;
import com.google.ar.sceneform.samples.augmentedfaces.product_details.ProductDetails;
import com.google.ar.sceneform.samples.augmentedfaces.cart.CartActivity;
import com.google.ar.sceneform.samples.augmentedfaces.product.service.ProductList;
import com.google.ar.sceneform.samples.augmentedfaces.MainActivity;
import com.nex3z.notificationbadge.NotificationBadge;


public class ProductView extends AppCompatActivity {

    public static NotificationBadge prod_view_badge;
    private ProductList prod_list = new ProductList();
    private ImageButton buttonBack, cartIcon;
    private ImageView title_bar;
    //Bundle
    private String product_label, product_price, product_weight, product_details;
    private int product_image;
    //
    private Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_view);

        //hide on-screen bottom navigation
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        ImageView imageView = (ImageView) findViewById(R.id.viewProductImage);
        TextView item_name = (TextView) findViewById(R.id.viewProductName);
        TextView item_price = (TextView) findViewById(R.id.viewProductPrice);
        TextView item_weight = (TextView) findViewById(R.id.viewProductWeight);
        TextView item_details = (TextView) findViewById(R.id.viewProductDetails);

        //Get Value From Catalog
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            product_label = bundle.getString("LABEL");
            product_price = bundle.getString("PRICE");
            product_image = bundle.getInt("IMAGE");
            product_weight = bundle.getString("WEIGHT");
            product_details = bundle.getString("DETAILS");

            item_name.setText(product_label);
            item_price.setText(product_price);
            imageView.setImageResource(product_image);
            item_weight.setText(product_weight);
            item_details.setText(product_details);
        }

        title_bar = (ImageView) findViewById(R.id.app_bar_title);
        title_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProductView.this, ProductCatalog.class);
                startActivity(intent);
            }
        });

        cartIcon = (ImageButton) findViewById(R.id.catalog_cart_icon);
        cartIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProductView.this, CartActivity.class);
                startActivity(intent);
            }
        });

        prod_view_badge = (NotificationBadge) findViewById(R.id.catalog_cart_badge);
        prod_view_badge.setNumber(prod_list.counter);

        buttonBack = (ImageButton) findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void Buy(View v) {

        if (product_label.equalsIgnoreCase("RAY-BAN WAYFARER")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "RAY-BAN WAYFARER");
            intent.putExtra("COLOR", "Black");
            intent.putExtra("PRICE", "599.99");
            intent.putExtra("PICTURE", R.drawable.model_1);
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("BLENDABLE LIP AND CHEEK COLOR")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "BLENDABLE LIP AND CHEEK COLOR");
            intent.putExtra("PRICE", "81.40");
            intent.putExtra("PICTURE", R.drawable.blendable_lip_angel);
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("BLENDABLE LIP AND CHEEK COLOR ANGEL")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "BLENDABLE LIP AND CHEEK COLOR ANGEL");
            intent.putExtra("PRICE", "81.40");
            intent.putExtra("PICTURE", R.drawable.blendable_lip_angel);
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("METALLIC PRO LIPSTICK")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "METALLIC PRO LIPSTICK");
            intent.putExtra("PRICE", "86.80");
            intent.putExtra("PICTURE", R.drawable.blendable_lip_angel);
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("MATTE PRO LIPSTICK")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "MATTE PRO LIPSTICK");
            intent.putExtra("PRICE", "86.80");
            intent.putExtra("PICTURE", R.drawable.blendable_lip_angel);
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("MATTE PRO LIPSTICK BLITZ")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "MATTE PRO LIPSTICK BLITZ");
            intent.putExtra("PRICE", "86.80");
            intent.putExtra("PICTURE", R.drawable.blendable_lip_angel);
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("LIP GLOSS")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "LIP GLOSS");
            intent.putExtra("PRICE", "97.70");
            intent.putExtra("PICTURE", R.drawable.blendable_lip_angel);
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("LIP CHEEK EYE COLOR")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "LIP CHEEK EYE COLOR");
            intent.putExtra("PRICE", "108.70");
            intent.putExtra("PICTURE", R.drawable.blendable_lip_angel);
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("LONG LASTING METALLIC LIP COLOR")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "LONG LASTING METALLIC LIP COLOR");
            intent.putExtra("PRICE", "119.60");
            intent.putExtra("PICTURE", R.drawable.blendable_lip_angel);
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("LONG LASTING LIP COLOR")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "LONG LASTING LIP COLOR");
            intent.putExtra("PRICE", "119.60");
            intent.putExtra("PICTURE", R.drawable.blendable_lip_angel);
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("CLASSIQUE LIPSTICK")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "CLASSIQUE LIPSTICK");
            intent.putExtra("PRICE", "119.60");
            intent.putExtra("PICTURE", R.drawable.blendable_lip_angel);
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("METALLIC PRO LIPSTICK HOLLYWOOD")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "METALLIC PRO LIPSTICK HOLLYWOOD");
            intent.putExtra("PRICE", "86.80");
            intent.putExtra("PICTURE", R.drawable.blendable_lip_angel);
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("MAGIC PINK LIP GLOSS - 5 PCS BUNDLE")){
            intent = new Intent(this, ProductDetails.class);
            intent.putExtra("LABEL", "MAGIC PINK LIP GLOSS - 5 PCS BUNDLE");
            intent.putExtra("PRICE", "297.60");
            intent.putExtra("PICTURE", R.drawable.blendable_lip_angel);
            startActivity(intent);

        }

    }

    public void Try(View v){

        if (product_label.equalsIgnoreCase("RAY-BAN WAYFARER")){
            intent = new Intent(this, MainActivity.class);
            intent.putExtra("LABEL", "RAY-BAN WAYFARER");
            intent.putExtra("MODEL", "models/glass.glb");
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("BOSE FRAMES")){
            intent = new Intent(this, MainActivity.class);
            intent.putExtra("LABEL", "BOSE FRAMES");
            intent.putExtra("MODEL", "models/glass2.glb");
            startActivity(intent);

        }else if (product_label.equalsIgnoreCase("VINTAGE WIRE ROUND RIM GLASSES")){
            intent = new Intent(this, MainActivity.class);
            intent.putExtra("LABEL", "VINTAGE WIRE ROUND RIM GLASSES");
            intent.putExtra("MODEL", "models/glass3.glb");
            startActivity(intent);

        }
    }


}