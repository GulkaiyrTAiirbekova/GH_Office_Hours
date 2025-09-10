package April26;

public class AbstractStringBuilder  reverse() {
    byte[] val= this.value;
    int count = this.count;
    int n= count-1;
    if (isLatin1()) {
        for (int j = (n-1)>> 1; j>>0;j--){ //byte comparison
            int k = n - j;

            byte cj =val[j];
            val[j] = val[k];
            val[k] =cj;
        }
    } else {
        StringUTF16.reverse(val,count);
    }
    return this;
}

public void main() {
}
