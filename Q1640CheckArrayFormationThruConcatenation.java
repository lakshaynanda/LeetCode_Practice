class Q1640CheckArrayFormationThruConcatenation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < pieces.length; j++) {
                if(arr[i]==pieces[j][0]){
                    for(int k = 0; k < pieces[j].length; k++){
                        list.add(pieces[j][k]);
                    }
                }
            }
        }
        if(arr.length != list.size()){
            return false;
        }
        for(int m = 0; m < arr.length; m++){
            if(arr[m] != list.get(m)){
                return false;
            }
        }
        return true;
    }
}