package U4;

import H4.h;
import H4.j;
import Q4.t;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.documentfile.provider.DocumentFile;
import androidx.recyclerview.widget.RecyclerView;
import j6.n;
import java.io.File;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class e extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final M4.g f10377a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f10378b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f10379c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f10380d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f10381e;

    /* renamed from: f, reason: collision with root package name */
    private final CheckBox f10382f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View itemView, M4.g listener) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        this.f10377a = listener;
        View findViewById = itemView.findViewById(H4.e.f3705s);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.iv_icon_file_item)");
        this.f10378b = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(H4.e.f3578B1);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_name_file_item)");
        TextView textView = (TextView) findViewById2;
        this.f10379c = textView;
        View findViewById3 = itemView.findViewById(H4.e.f3595H0);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.tv_date_file_item)");
        TextView textView2 = (TextView) findViewById3;
        this.f10380d = textView2;
        View findViewById4 = itemView.findViewById(H4.e.f3626R1);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_size_file_item)");
        TextView textView3 = (TextView) findViewById4;
        this.f10381e = textView3;
        View findViewById5 = itemView.findViewById(H4.e.f3675i);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.id.cb_checked_file_item)");
        this.f10382f = (CheckBox) findViewById5;
        j.a aVar = j.f3824g;
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(e this$0, Object file, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(file, "$file");
        int absoluteAdapterPosition = this$0.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition != -1) {
            this$0.f10377a.a(file, absoluteAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(e this$0, Object file, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(file, "$file");
        int absoluteAdapterPosition = this$0.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition != -1) {
            this$0.f10377a.b(file, absoluteAdapterPosition);
            return true;
        }
        return true;
    }

    public final void c(final Object file, boolean z8, boolean z9) {
        long j8;
        String str;
        String str2;
        boolean z10;
        Drawable drawable;
        AbstractC3255y.i(file, "file");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: U4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.d(e.this, file, view);
            }
        });
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: U4.d
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean e8;
                e8 = e.e(e.this, file, view);
                return e8;
            }
        });
        if (file instanceof File) {
            File file2 = (File) file;
            str = file2.getName();
            str2 = new Q4.e().g(file2.lastModified());
            z10 = file2.isDirectory();
            j8 = file2.length();
        } else if (file instanceof DocumentFile) {
            DocumentFile documentFile = (DocumentFile) file;
            str = documentFile.getName();
            str2 = new Q4.e().g(documentFile.lastModified());
            z10 = documentFile.isDirectory();
            j8 = documentFile.length();
        } else {
            j8 = 0;
            str = null;
            str2 = null;
            z10 = false;
        }
        if (str != null) {
            this.f10379c.setText(str);
            if (z10) {
                this.f10381e.setText(j.f3824g.g().getString(h.f3808p, new Q4.e().b(file)));
                drawable = AppCompatResources.getDrawable(this.f10379c.getContext(), H4.d.f3556d);
            } else {
                this.f10381e.setText(new Q4.g().c(j8));
                if (n.r(str, ".apk", false, 2, null)) {
                    t tVar = t.f9230a;
                    if (tVar.a().get(str) != null) {
                        drawable = (Drawable) tVar.a().get(str);
                    } else {
                        drawable = AppCompatResources.getDrawable(this.f10379c.getContext(), H4.d.f3553a);
                    }
                } else if (!n.r(str, ".xapk", false, 2, null) && !n.r(str, ".apks", false, 2, null)) {
                    if (n.r(str, ".zip", false, 2, null)) {
                        drawable = AppCompatResources.getDrawable(this.f10379c.getContext(), H4.d.f3570r);
                    } else {
                        drawable = AppCompatResources.getDrawable(this.f10379c.getContext(), H4.d.f3555c);
                    }
                } else {
                    drawable = AppCompatResources.getDrawable(this.f10379c.getContext(), H4.d.f3569q);
                }
            }
            this.f10378b.setImageDrawable(drawable);
        }
        if (str2 != null) {
            this.f10380d.setText(str2);
        }
        if (z8) {
            this.f10382f.setVisibility(0);
            this.f10381e.setVisibility(4);
            this.f10382f.setChecked(z9);
        } else {
            this.f10382f.setVisibility(8);
            this.f10381e.setVisibility(0);
        }
    }
}
