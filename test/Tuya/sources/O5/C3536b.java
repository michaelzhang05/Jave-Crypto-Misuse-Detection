package o5;

import E4.j;
import W4.InterfaceC1480c;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3536b extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1480c f36727a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f36728b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36729c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36730d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f36731e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3536b(View itemView, InterfaceC1480c listener) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        this.f36727a = listener;
        View findViewById = itemView.findViewById(R.id.rl_app_file_item);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.rl_app_file_item)");
        this.f36728b = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_type_app_file_item);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_type_app_file_item)");
        this.f36729c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_app_file_item);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_name_app_file_item)");
        this.f36730d = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_size_app_file_item);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_size_app_file_item)");
        this.f36731e = (TextView) findViewById4;
        TextView textView = this.f36729c;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        this.f36730d.setTypeface(aVar.t());
        this.f36731e.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3536b this$0, X4.r fileInfo, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(fileInfo, "$fileInfo");
        this$0.f36727a.a(fileInfo);
    }

    public final void b(final X4.r fileInfo) {
        AbstractC3159y.i(fileInfo, "fileInfo");
        this.f36728b.setOnClickListener(new View.OnClickListener() { // from class: o5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3536b.c(C3536b.this, fileInfo, view);
            }
        });
        String c8 = fileInfo.c();
        if (c8 != null) {
            TextView textView = this.f36729c;
            String substring = c8.substring(g6.n.X(c8, ".", 0, false, 6, null) + 1);
            AbstractC3159y.h(substring, "substring(...)");
            textView.setText(substring);
        }
        this.f36730d.setText(fileInfo.c());
        this.f36731e.setText(new N4.g().c(fileInfo.e()));
    }
}
