package o5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3563o0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final W4.t f36846a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f36847b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f36848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3563o0(View itemView, String text, W4.t tVar) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(text, "text");
        this.f36846a = tVar;
        View findViewById = itemView.findViewById(R.id.tv_system_apps_title);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.tv_system_apps_title)");
        TextView textView = (TextView) findViewById;
        this.f36847b = textView;
        this.f36848c = (ImageView) itemView.findViewById(R.id.iv_title_info);
        textView.setTypeface(E4.j.f2274g.t());
        textView.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3563o0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f36846a.a();
    }

    public final void b(boolean z8) {
        if (z8) {
            this.f36847b.setVisibility(0);
        } else {
            this.f36847b.setVisibility(8);
        }
        if (this.f36846a != null) {
            ImageView imageView = this.f36848c;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f36848c;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: o5.n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3563o0.c(C3563o0.this, view);
                    }
                });
                return;
            }
            return;
        }
        ImageView imageView3 = this.f36848c;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
    }
}
