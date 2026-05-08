class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int size : asteroids){
            boolean collide = false;
            while(!s.isEmpty() && s.peek() > 0 && size < 0){
                if(Math.abs(size) > s.peek()){
                    s.pop();
                    continue;
                }
                else if(Math.abs(size) == s.peek()){
                    s.pop();
                }
                collide = true;
                break;
                
            }
            if(!collide){
                s.push(size);
            }
        }
        int[] finalAsteroids = new int[s.size()];
        for(int i = finalAsteroids.length-1;i >= 0 ;--i){
            finalAsteroids[i] = s.pop();
        }
        return finalAsteroids;
    }
    
}