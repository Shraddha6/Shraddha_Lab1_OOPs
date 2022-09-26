# Problem Statement

<br>
When allocating a room I should also show an estimate of
price. The cost of rooms is based on the occupancy as
shown below:

Single occupancy: Rs. 2000 / day<br>
Double occupancy: Rs. 3000 / day<br>
Triple occupancy: Rs. 4000 / day<br>

Air conditioned rooms have fixed additional charge of Rs.
1000 / day.<br>
The program needs to be able to take multiple inputs and
maintain state.

<b>Input 1:</b> Single occupancy AC
<br>
<b>output 1:</b>
Room nuomber: 101, first floor, air conditioned, single
occupancy, estimated: Rs. 3000 / day

<b>Input 2:</b>
Single occupancy AC
<br><b>Output 2:</b>
Room number: 201, second floor, air conditioned, single
occupancy, estimated: Rs. 3000 / day

<b>Input 3:</b>
Single occupancy AC
<br><b>Output 3:</b>
Single occupancy AC room not available

<b>Input 4</b>:
Single occupancy non-AC
<br><b>Output 4:</b>
Room number: 202, second floor, non-air conditioned, single
occupancy, estimated: Rs. 2000 / day

<b>Extension:</b> Nowadays some people come with very specific
preferences saying they would prefer the room to be allocated
in the specified floor. I want to be able to allocate rooms as per
rtheir preference.<br>
<b>Input 1:</b>
Single occupancy AC second floor
<br><b>Output 1:</b>
Room number: 201, second floor, air conditioned, single
occupancy

<b>Input 2:</b>
Single occupancy AC second floor
<br><b>Output 2:</b>
Single occupancy AC room not availabl