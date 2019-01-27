public class n23_VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) return false;
        return isBST(sequence,0,sequence.length-1);
    }

    public boolean isBST(int [] sequesce, int start, int end){
        if(start >= end) return true;
        int i = start;
        for(; i < end; i++) if(sequesce[i] > sequesce[end]) break;
        for(int j = i; j < end; j++) if(sequesce[j] < sequesce[end]) return false;
        return isBST(sequesce,start,i-1) && isBST(sequesce,i,end-1);
    }
}
