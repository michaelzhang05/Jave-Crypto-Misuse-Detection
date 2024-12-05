package u4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private String f9487a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f9488b;

    /* renamed from: c, reason: collision with root package name */
    private Context f9489c;

    public a(String str, ImageView imageView, Context context) {
        this.f9487a = str;
        this.f9488b = imageView;
        this.f9489c = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap doInBackground(Void... voidArr) {
        Bitmap decodeStream;
        String str = this.f9487a;
        try {
            if (str == null || !str.toLowerCase().startsWith("http")) {
                decodeStream = BitmapFactory.decodeStream(this.f9489c.getAssets().open(this.f9487a));
            } else {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f9487a).openConnection();
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                decodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
            }
            return decodeStream;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        this.f9488b.setImageBitmap(bitmap);
    }
}
