package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private final Context g0;
    private final ArrayAdapter h0;
    private Spinner i0;
    private final AdapterView.OnItemSelectedListener j0;

    /* loaded from: classes.dex */
    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (i2 >= 0) {
                String charSequence = DropDownPreference.this.h1()[i2].toString();
                if (charSequence.equals(DropDownPreference.this.i1()) || !DropDownPreference.this.f(charSequence)) {
                    return;
                }
                DropDownPreference.this.k1(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.f1360d);
    }

    private int m1(String str) {
        CharSequence[] h1 = h1();
        if (str == null || h1 == null) {
            return -1;
        }
        for (int length = h1.length - 1; length >= 0; length--) {
            if (h1[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    private void n1() {
        this.h0.clear();
        if (f1() != null) {
            for (CharSequence charSequence : f1()) {
                this.h0.add(charSequence.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void d0() {
        super.d0();
        ArrayAdapter arrayAdapter = this.h0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void j0(l lVar) {
        Spinner spinner = (Spinner) lVar.itemView.findViewById(p.f1371e);
        this.i0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.h0);
        this.i0.setOnItemSelectedListener(this.j0);
        this.i0.setSelection(m1(i1()));
        super.j0(lVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void k0() {
        this.i0.performClick();
    }

    protected ArrayAdapter l1() {
        return new ArrayAdapter(this.g0, R.layout.simple_spinner_dropdown_item);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.j0 = new a();
        this.g0 = context;
        this.h0 = l1();
        n1();
    }
}
