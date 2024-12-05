package cm.aptoide.pt.account.view;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import cm.aptoide.pt.logger.Logger;
import java.io.File;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: ImageInfoProvider.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0006R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcm/aptoide/pt/account/view/ImageInfoProvider;", HttpUrl.FRAGMENT_ENCODE_SET, "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "TAG", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "getInfo", "Lcm/aptoide/pt/account/view/ImageInfo;", "imagePath", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageInfoProvider {
    private final String TAG;
    private final ContentResolver contentResolver;

    public ImageInfoProvider(ContentResolver contentResolver) {
        kotlin.jvm.internal.l.f(contentResolver, "contentResolver");
        this.contentResolver = contentResolver;
        this.TAG = ImageInfoProvider.class.getName();
    }

    public final ImageInfo getInfo(String imagePath) {
        boolean n;
        boolean n2;
        kotlin.jvm.internal.l.f(imagePath, "imagePath");
        String[] strArr = {"_data", "height", "width", "_size"};
        Uri parse = Uri.parse(imagePath);
        n = kotlin.text.u.n(parse != null ? parse.getScheme() : null, "content", false, 2, null);
        if (n) {
            Cursor query = this.contentResolver.query(parse, strArr, null, null, null);
            if (query != null) {
                try {
                    query.moveToFirst();
                    int i2 = query.getInt(query.getColumnIndex("width"));
                    int i3 = query.getInt(query.getColumnIndex("height"));
                    long j2 = query.getLong(query.getColumnIndex("_size"));
                    query.close();
                    return new ImageInfo(i3, i2, j2);
                } catch (Exception e2) {
                    Logger.getInstance().e(this.TAG, (Throwable) e2);
                }
            }
        } else {
            n2 = kotlin.text.u.n(parse != null ? parse.getScheme() : null, "file", false, 2, null);
            if (n2) {
                try {
                    File file = new File(imagePath);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                    return new ImageInfo(options.outHeight, options.outWidth, file.length());
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
        return null;
    }
}
